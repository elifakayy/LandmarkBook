package com.elif.landmarkbook;

import android.media.Image;

import java.io.Serializable;

public class Landmark implements Serializable {

    String name;
    String country;
    int img;

    //constructor

    public Landmark(String name,String country,int img){
        this.name=name;
        this.country=country;
        this.img=img;
    }

}
