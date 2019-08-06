package com.cloud.config.entity;
public class Response {
    private String url;
    private String msg;

    public Response(String url, String msg) {
        this.url = url;
        this.msg = msg;
    }

    public String getUrl() {
        return url;
    }

    public String getMsg() {
        return msg;
    }
}
