package com.zh.springweb.springweb.bean;

public class TableBean {

    private String name;
    private String position;
    private String office;
    private String age;
    private String startTime;
    private String count;

    public TableBean(String name, String position, String office, String age, String startTime, String count) {
        this.name = name;
        this.position = position;
        this.office = office;
        this.age = age;
        this.startTime = startTime;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
}
