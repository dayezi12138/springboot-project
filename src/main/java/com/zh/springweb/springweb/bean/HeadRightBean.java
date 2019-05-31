package com.zh.springweb.springweb.bean;

public class HeadRightBean {

    private String name;
    private String url = "#";

    public HeadRightBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
