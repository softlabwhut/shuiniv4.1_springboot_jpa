layui.use('laydate', function(){
  var laydate = layui.laydate;
  //时间选择器
  laydate.render({
    elem: '#startTime'
    ,type: 'datetime'
  });
   laydate.render({
    elem: '#endTime'
    ,type: 'datetime'
  });
    laydate.render({
        elem: '#activityTime'
        ,type: 'datetime'
    });
  //直接嵌套显示
  laydate.render({
    elem: '#test-n1'
    ,position: 'static'
  });
  laydate.render({
    elem: '#test-n2'
    ,position: 'static'
    ,lang: 'en'
  });
  laydate.render({
    elem: '#test-n3'
    ,type: 'month'
    ,position: 'static'
  });
  laydate.render({
    elem: '#test-n4'
    ,type: 'time'
    ,position: 'static'
  });
});