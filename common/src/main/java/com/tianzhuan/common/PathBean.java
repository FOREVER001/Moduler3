package com.tianzhuan.common;

import android.app.Service;

/**
 * 路径对象（公共基础库中，所有子模块都可以调用）
 * 如：
 * path:”order/order_MainActivity"
 * clazz:Order_MainActivity.class
 */
public class PathBean {
    private String path;
    private Class clazz;

    public PathBean() {
    }

    public PathBean(String path, Class clazz) {
        this.path = path;
        this.clazz = clazz;
    }

    public String getPath() {
        return path == null ? "" : path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }
}
