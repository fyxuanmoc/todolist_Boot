package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by fengy on 2017/10/1.
 */
@Entity
public class TodoList {
    @Id
    @GeneratedValue
    private int id;

    private String thing;

    private  int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public TodoList(String thing, int status) {
        this.thing = thing;
        this.status = status;
    }
//必须有不带参的构造函数
    public TodoList() {
    }
}
