package com.example.tourguideapp;

public class Item {
    private String title;
    private String description;
    private int mImageResourceId;
    private String location;
    boolean locationProvided = false;

    public Item(String title,String description,int mImageResourceId){
        this.title = title;
        this.description = description;
        this.mImageResourceId = mImageResourceId;
    }
    public Item(String title, String description, int mImageResourceId,String location){
        this.title = title;
        locationProvided = true;
        this.description = description;
        this.mImageResourceId = mImageResourceId;
        this.location = location;
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

    public String getLocation() {
        return location;
    }
}
