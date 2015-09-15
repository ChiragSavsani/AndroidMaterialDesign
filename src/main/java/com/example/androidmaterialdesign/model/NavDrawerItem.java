package com.example.androidmaterialdesign.model;

public class NavDrawerItem {
    private boolean showNotify;
    private String title;
    int imgResID;


    public NavDrawerItem() {

    }

    public NavDrawerItem(String title,int imgResID) {

        this.title = title;
        this.imgResID = imgResID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgResID() {
        return imgResID;
    }

    public void setImgResID(int imgResID) {
        this.imgResID = imgResID;
    }
}
