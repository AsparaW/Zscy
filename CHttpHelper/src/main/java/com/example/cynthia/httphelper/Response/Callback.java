package com.example.cynthia.httphelper.Response;

public interface Callback<T> {
    void succeed(String response);
    void error(Exception e,int status);
}
