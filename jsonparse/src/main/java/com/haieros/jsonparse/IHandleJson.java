package com.haieros.jsonparse;

/**
 * Created by Kang on 2018/4/11.
 */

public interface IHandleJson<T> {

    T parseJson(String json);

    void handle(T t);
}
