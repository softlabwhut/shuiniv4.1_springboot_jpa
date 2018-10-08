<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>多条件查询</title>
    <!--<script src="http://cdn.bootcss.com/jquery/2.2.4/jquery.js"></script>-->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div id="container" >
<div class="searchBox">
    <div >
        <tr  >
           <td>一级类别</td>
            <td>
                <select name="province" id="province0" onchange="bindC(0)">
                    <option value="">请选择一级类别</option>
                </select>
            </td>
            <td>二级类别</td>
            <td>
                <select name="city" id="city0">
                    <option value="">请选择二级类别</option>
                </select>
            </td>
            <td> <select>
                <option>模糊</option>
                <option>精确</option>
            </select></td>
            <td> <input type="text" id="data0" placeholder="请输入"></td>
        </tr>
    </div>
    <div id="type-box" >
        <!--<span class="activity-type-label">家长姓名</span>-->
    </div>


    <td><button id="tianjia" onclick="add()">添加查询条件</button></td>
    <td><button id="shanchu" onclick="del()">删除查询条件</button></td>
    <td><button id="chaxun" onclick="quy()">查询</button></td>
    <td><button id="daochu" onclick="daochu()">导出</button></td>



</div>
    <div class="table-list">
        <table class="table table-bordered">
            <thead>

            <tr>
                <th width="20%">企业名称</th>
                <th width="10%">水泥产量</th>
                <th width="10%">熟料产量</th>
                <th width="20%">地址</th>
                <th width="10%">年运转天数</th>
                <th width="15%">操作</th>
            </tr>

            </thead>
            <tbody id="list">

            </tbody>
        </table>
    </div>
</div>
<script type="text/javascript" src="/js/JiLian.js" ></script>
</body>
</html>