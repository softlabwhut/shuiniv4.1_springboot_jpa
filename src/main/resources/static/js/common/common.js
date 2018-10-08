// 公用页面 left导航
function drawLeftFn(){
    var obj=document.getElementById('leftBox');
    obj.innerHTML="<dl>\n" +
        "    <dt id=\"first\"><a href=\"#\"><span class=\"glyphicon glyphicon-user left-logo\"></span>用户管理</a></dt>\n" +
        "    <dd id=\"manage\" style='display: none'><a href=\"../userManage/userManage.html\">管理员账号管理</a></dd>\n" +
        "    <dd id=\"user\" style='display: none'><a href=\"../userManage/userList.html\">用户信息统计</a></dd>\n" +
        "    <dt id=\"video\"><a href=\"../videoManage/videoManage.html\"><span class=\"glyphicon glyphicon-film left-logo\"></span>视频管理</a></dt>\n" +
        "    <dt id=\"article\"><a href=\"../articleManage/articleManage.html\"><span class=\"glyphicon glyphicon-duplicate left-logo\"></span>文章管理</a></dt>\n" +
        "    <dt id=\"story\"><a href=\"../storyManage/storyManage.html\"><span class=\"glyphicon glyphicon-lamp left-logo\"></span>故事管理</a></dt>\n" +
        "    <dt id=\"activity\"><a href=\"../activityManage/activityManage.html\"><span class=\"glyphicon glyphicon-glass left-logo\"></span>活动管理</a></dt>\n" +
        "    <dt id=\"notice\"><a href=\"../notice/notice_manage.html\"><span class=\"glyphicon glyphicon-file left-logo\"></span>公告管理</a></dt>\n" +
        "    <dt id=\"livingRoom\"><a href=\"../livingRoom/livingRoom.html\"><span class=\"glyphicon glyphicon-fire left-logo\"></span>直播管理</a></dt>\n" +
        "</dl>";
    document.getElementById("first").onclick=function () {
        var odd=document.getElementsByTagName("dd");
        for(var i=0;i<odd.length;i++){
            if(odd[i].style.display=="none"){
                odd[i].style.display="block";
            }else{
                odd[i].style.display="none";
            }
        }
    }
}
drawLeftFn()

// 公用页面 顶部标题栏
function drawTopFn() {
    var obj=document.getElementsByClassName("header")[0];
    obj.innerHTML="<div class=\"logo\"><img src=\"../../assets/img/duodaologo.png\"></div>\n" +
        "         <div class=\"title\">多道互联儿童安全教育APP后台管理</div>\n" +
        "         <div class=\"userBox\">\n" +
        "            <button class=\"fl btn-primary header_publish_btn\" id=\"messageCenter\">消息中心<span class='messageNum' id='messageNum'></span></button>\n" +
        "            <a href=\"../userInfo/userinfo.html\">\n" +
        "                <img src=\"../../assets/img/logo.png\" class=\"userPic fl\">\n" +
        "                <span class=\"userName fl\" id=\"personName\"></span>\n" +
        "            </a>\n" +
        "            <span class=\"glyphicon glyphicon-chevron-down downLogo\" id=\"downLogo\"></span>\n" +
        "            <div class=\"addDiv\" style='display: none' id=\"addDiv\">\n" +
        "                <span class=\"add-div-item\" id=\"logOutBtn\">退出登录</span>\n" +
        "            </div>\n" +
        "         </div>"
    downLogoFn();//下拉选项
}
function downLogoFn(){
    var downLogo=document.getElementById('downLogo');
    var logOutBtn=document.getElementById('addDiv');
    downLogo.onclick=function(){
        if(logOutBtn.style.display=="none"){
            logOutBtn.style.display="block";
        }else{
            logOutBtn.style.display="none"
        }
    }
    logOutFn();//退出登录函数
    messageCenterFn();
}
function logOutFn(){
    var logOutBtn=document.getElementById('logOutBtn');
    logOutBtn.onclick=function(){
        $.ajax({
            url:'/duodao/adminLogout',
            data:'',
            dataType:"json",
            type:"post",
            success:function (str) {
                if(str.status==1){
                    window.location.replace('../index.html');
                }
            }
        })
    }
}
function messageCenterFn(){
    var messageNum=document.getElementById("messageNum");
    $.ajax({
        url:'/duodao/adminMessageNum',
        data:'',
        dataType:"json",
        type:"post",
        success:function (str) {
            if(str.object==0){
                messageNum.innerHTML="";
            }else{
                messageNum.innerHTML=str.object;
            }
        }
    })
    var messageCenter=document.getElementById("messageCenter");
    messageCenter.onclick=function () {
            window.location.replace("../messageCenter/message_manage.html")
    }
}
function getName(){
    $.ajax({
        url:'../../duodao/userInfo',
        data:'',
        dataType:"json",
        type:"post",
        success:function (str) {
            document.getElementById('personName').innerHTML=str.name
        }
    })
}
drawTopFn();
getName();



// 加文章图片事件
var imgZ=document.getElementById('img-z');
var imgC=document.getElementById('img-c');
imgC.onchange=function () {
    imgPreview(this,'preview-c')
}
imgZ.onchange=function () {
    imgPreview(this,'preview-z');
}
function imgPreview(fileDom,preview){
    //判断是否支持FileReader
    if (window.FileReader) {
        var reader = new FileReader();
    } else {
        alert("您的设备不支持图片预览功能，如需该功能请升级您的设备！");
    }
    //获取文件
    var file = fileDom.files[0];
    // alert(fileDom)
    var imageType = /^image\//;
    //是否是图片
    if (!imageType.test(file.type)) {
        alert("请选择图片！");
        return;
    }
    //读取完成
    reader.onload = function(e) {
        //获取图片dom
        var img = document.getElementById(preview);
        //图片路径设置为读取的图片
        img.src = e.target.result;
    };
    reader.readAsDataURL(file);
}

function backBtnFn(backBtn,url){
    var btn=document.getElementById(backBtn);
    btn.onclick=function(){
        if(confirm('确认返回吗？返回后数据无法保存！')){
            window.location.href=url;
        }
    }
}


//获取网址的id
function getVideoId() {
    var Request = new Object();
    Request = GetRequest();
    return Request['id'];
}
function GetRequest() {
    var url = location.search; //获取url中"?"符后的字串
    var theRequest = new Object();
    if (url.indexOf("?") != -1) {
        var str = url.substr(1);
        strs = str.split("&");
        for(var i = 0; i < strs.length; i ++) {
            theRequest[strs[i].split("=")[0]]=(strs[i].split("=")[1]);
        }
    }
    return theRequest;
}