package com.example.contactrecyclerview;

import java.io.Serializable;

public class ListModel implements Serializable {
    public String color;
    public String title;
    public String no;
    public String status;

    public ListModel(String color, String title, String no, String status) {
        this.color = color;
        this.title = title;
        this.no = no;
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
