package com.whut.springbootjpacementv4_1.bean;


public class Result {
    //成功标志 0失败 1成功
    private int status;
    //状态代码 方便前端匹配错误码表
    private int code;
    //可读性错误信息
    private String msg;
    //返回的数据对象
    private Object object;

    public Result() {
        this.status = 0;
        this.code = 0;
        this.msg = "未知错误";
    }

    public Result(int code, String msg) {
        this.status = 0;
        this.code = code;
        this.msg = msg;
    }

    public Result(Object result) {
        this.status = 1;
        this.code = 0;
        this.msg = "请求成功";
        this.object = result;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getObject() {
        return object;
    }
    public void setObject(Object object) {
        this.object = object;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }

}
