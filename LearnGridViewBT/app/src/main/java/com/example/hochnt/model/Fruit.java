package com.example.hochnt.model;

import android.widget.ImageView;

/**
 * Created by hochnt on 7/22/2016.
 */
public class Fruit {
    private int ma;
    private String ten;
    private int soLuong;
    int imgFruit;

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getImgFruit() {
        return imgFruit;
    }

    public void setImgFruit(int imgFruit) {
        this.imgFruit = imgFruit;
    }

    public Fruit(int ma, String ten, int soLuong, int imgFruit) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.imgFruit = imgFruit;
    }

    public Fruit() {
    }
}
