package com.iw.project_blog.common;

public enum ResultCode {
    SUCCESS("200"),
    FAILURE("500");

    private final String code;

    ResultCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}