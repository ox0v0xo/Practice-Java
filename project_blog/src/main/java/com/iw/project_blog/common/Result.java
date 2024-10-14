package com.iw.project_blog.common;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Result {
    private String code;
    private String msg;
    private Object data;

    private Result(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    private static Result createResult(ResultCode resultCode, String msg, Object data) {
        return new Result(resultCode.getCode(), msg, data);
    }

    public static Result successResult(String msg, Object data) {
        return createResult(ResultCode.SUCCESS, msg, data);
    }

    public static Result failResult(String msg, Object data) {
        return createResult(ResultCode.FAILURE, msg, data);
    }
}