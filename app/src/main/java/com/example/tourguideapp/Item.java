package com.example.tourguideapp;

public class Item {
    private String title;
    private String description;
    private int mImageResourceId;

    public Item(String title,String description,int mImageResourceId){
        this.title = title;
        this.description = description;
        this.mImageResourceId = mImageResourceId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }
}
