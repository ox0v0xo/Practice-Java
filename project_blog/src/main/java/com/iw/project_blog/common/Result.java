package com.iw.project_blog.common;

import lombok.Data;

@Data
public class Result {
    private String code;
    private String msg;
    private Object data;

    public static Result successResult(Object data) {
        Result r = new Result();
        r.setCode("0");
        r.setMsg("操作成功");
        r.setData(data);
        return r;
    }

    public static Result successResult(String msg, Object data) {
        Result r = new Result();
        r.setCode("0");
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result failResult(Object data) {
        Result r = new Result();
        r.setCode("-1");
        r.setMsg("操作失败");
        r.setData(data);
        return r;
    }

    public static Result failResult(String msg, Object data) {
        Result r = new Result();
        r.setCode("-1");
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
