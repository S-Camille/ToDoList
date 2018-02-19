package com.example.camil.todolist;

import java.lang.Enum;

public class TodoItem {

    private String lab;
    public enum Tags {
        Faible, Normal, Important
    };
    private Tags tag;
    private boolean tachRea;

    public TodoItem(Tags t, String l) {
        this.tag = t;
        this.lab = l;
        this.tachRea = false;
    }

    public String getLab() {
        return this.lab;
    }

    public Tags getTag() { return this.tag; }

    public boolean getTachRea() {
        return this.tachRea;
    }

    public void setLab(String l) {
        this.lab = l;
    }

    public void setTag(Tags t) { this.tag = t; }

    public void setTachRea(boolean tr) { this.tachRea = tr; }

}