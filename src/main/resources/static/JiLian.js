window.onload = function () {
    num = 1; //查询条件总个数 全局变量
    city_json = '{"资源消耗":["熟料烧成用原材料（含替代原料）", "燃料（含替代燃料）", "水泥制成用原材料（含替代原料)"],"废气排放":["颗粒物", "SO2 ", "NOx", "喷氨", "脱硝工艺"],"能源消耗":["生料粉磨工段电耗(kWh/t)", "可比熟料综合煤耗(kgce/t)", "可比熟料综合电耗(kWh/t)",\n' +
        '        "可比熟料综合能耗(kgce/t)", "可比水泥综合电耗(kWh/t)", "可比水泥综合能耗(kgce/t)",\n' +
        '        "单位熟料余热发电量(kWh/t)"]}';
    //
    city_key = {
        "熟料烧成用原材料（含替代原料）": ["zyxh_slsc_yl1_name"],
        "燃料（含替代燃料）": ["zyxh_rl_rl1_name"],
        "水泥制成用原材料（含替代原料)": ["zyxh_slzcylc_yl1_name"],
        "颗粒物": ["fqpf_keliwu_yw_pfnongdu"],//  `fqpf_keliwu_yw_pfnongdu` double DEFAULT NULL COMMENT '废气排放-颗粒物-窑尾-排放浓度',
        "SO2 ": ["fqpf_SO2_yw_nongdu"],
        "NOx": ["fqpf_NOX_yw_nongdu"],
        "喷氨": ["fqpf_pa_shuliao_paifang"],//  `fqpf_pa_shuliao_paifang` double DEFAULT NULL COMMENT '废气排放-喷氨-年排放量',
        "脱硝工艺": ["tuoxiaoGY"],
        "生料粉磨工段电耗(kWh/t)": ["nyxh_shengliao_dianhao"],
        "可比熟料综合煤耗(kgce/t)": ["nyxh_shuliao_meihao"],
        "可比熟料综合电耗(kWh/t)": ["nyxh_shuliao_dianhao"],
        "可比熟料综合能耗(kgce/t)": ["nyxh_shuliao_nenghao"],
        "可比水泥综合电耗(kWh/t)": ["nyxh_shuini_dianhao"],
        "可比水泥综合能耗(kgce/t)": ["nyxh_shuini_nenghao"],
        "单位熟料余热发电量(kWh/t)": ["nyxh_shuliao_fadian"]
    };
    addprovince(0);
    loadData();

}


//点击查询
function quy() {
    var a = new FormData();
    for (var i = 0; i < num; i++) {
        var keyI = document.getElementById("city" + i).value;
        var key = city_key[keyI];
        var value = document.getElementById("data" + i).value;
        a.append(key, value);
        console.log("key:" + key + "  value:" + value);
    }
    ;
    console.log(a);
    //向发送后台发送请求 返回请求数据
    loadData(a);

}

function loadData(a) {
    var data;
    $.ajax({
        url: 'http://localhost:8080/questionnaires/diaoyan/query',
        data: a,
        dataType: "json",
        type: "post",
        processData: false,
        contentType: false,
        success: function (str) {
            console.log(str);
            drawdata(str.object);
        }
    });
}

//页面画查询结果的表格
/**
 *
 * @param str
 *
 */
function drawdata(str) {
    var list = document.getElementById('list');
    list.innerHTML = "";
    var data = str.content;
    for (var i = 0; i < data.length; i++) {
        console.log(data[i]);
        var id = data[i].id;
        console.log("id=" + id);
        var comp_name = data[i].comp_name;
        var zyxh_shuinicl = data[i].zyxh_shuinicl;
        var zyxh_shuliaocl = data[i].zyxh_shuliaocl;
        var comp_address = data[i].comp_address;
        var year_run_days = data[i].year_run_days;
        var otr = document.createElement('tr');
        otr.innerHTML = "\t<td>" + comp_name + "</td>\n" +
            "                <td>" + zyxh_shuinicl + "</td>\n" +
            "                <td>" + zyxh_shuliaocl + "</td>\n" +
            "                <td>" + comp_address + "</td>\n" +
            "                <td>" + year_run_days + "</td>\n" +
            "                <td id='" + id + "'><a href=\"#\" >编辑</a><a >删除</a></td>"
        list.appendChild(otr);
    }

}

//删除一个查询条件
function del() {
    var spanId = "span" + (num - 1);
    var rspan = document.getElementById(spanId);
    rspan.parentNode.removeChild(rspan);
    //   var typeBox=document.getElementById("type-box");
    //  typeBox.innerHTML="";
    num = num - 1;

}

function add() {
//    alert("num"+num);
    var typeBox = document.getElementById("type-box");
    var oSpan = document.createElement('span');
    oSpan.id = "span" + num;

    // oSpan.innerHTML='<h1>哈哈</h1>';
    oSpan.innerHTML = ' <tr  >\n ' +
        '            <td>一级类别</td>\n' +
        '            <td>\n' +
        '                <select name="province" id="province' + num + '" onchange="bindC(' + num + ')">\n' +
        '                    <option value="">请选择一级类别</option>\n' +
        '                </select>\n' +
        '            </td>\n' +
        '\n' +
        '            <td>二级类别</td>\n' +
        '            <td>\n' +
        '                <select name="city" id="city' + num + '">\n' +
        '                    <option value="">请选择二级类别</option>\n' +
        '                </select>\n' +
        '            </td>\n' + '<td> <select>\n' +
        '                <option>模糊</option>\n' +
        '                <option>精确</option>\n' +
        '            </select></td>' +
        '            <td> <input type="text" id="data' + num + '" placeholder="请输入"></td>\n' +
        '        </tr><br>';

    typeBox.appendChild(oSpan);
    addprovince(num);
    //  blindnewChange(num)
    num = num + 1;
}

function bindC(i) {
    var cProv = "#province";
    var cCity = "#city";
    tem = cProv + i;
    temCity = cCity + i;
    //  alert("new change "+tem);
    var city_obj = eval('(' + city_json + ')');
    //  alert("元素"+tem+"的onchange");
    var now_province = $(tem).val();
    //  alert("blind onchange"+now_province);
    $(temCity).html('<option value="">请选择二级类别</option>');
    for (var k in city_obj[now_province]) {
        var now_city = city_obj[now_province][k];
        $(temCity).append('<option value="' + now_city + '">' + now_city + '</option>');
    }
}

//绑定 change函数
function blindnewChange(i) {
    var cProv = "#province";
    var cCity = "#city";
    tem = cProv + i;
    temCity = cCity + i;
    //  alert("new change "+tem);
    var city_obj = eval('(' + city_json + ')');
    $(tem).change(function () {

        alert("元素" + tem + "的onchange");
        var now_province = $(this).val();
        //  alert("blind onchange"+now_province);
        $(temCity).html('<option value="">请选择二级类别</option>');
        for (var k in city_obj[now_province]) {
            var now_city = city_obj[now_province][k];
            $(temCity).append('<option value="' + now_city + '">' + now_city + '</option>');
        }
    })
}

function blindchange() {
    //绑定
    var cProv = "#province";
    var cCity = "#city";
    for (var i = 0; i <= 10; i++) {
        tem = cProv + i;
        temCity = cCity + i;
        $(tem).change(function () {
            var now_province = $(this).val();
            $(temCity).html('<option value="">请选择二级类别</option>');
            for (var k in city_obj[now_province]) {
                var now_city = city_obj[now_province][k];
                $(temCity).append('<option value="' + now_city + '">' + now_city + '</option>');
            }
        })
    }
}

//添加一级标题
function addprovince(i) {
    var city_obj = eval('(' + city_json + ')');
    var cProv = "#province" + i;
    for (var key in city_obj) {
        $(cProv).append("<option value='" + key + "'>" + key + "</option>");
    }
}

