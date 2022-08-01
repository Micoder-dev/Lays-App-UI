package com.example.laysappui;

public class LaysModal {

    private String laysName;
    private int imgId, tColor;

    public LaysModal(String laysName, int imgId, int tColor) {
        this.laysName = laysName;
        this.imgId = imgId;
        this.tColor = tColor;
    }

    public String getLaysName() {
        return laysName;
    }

    public void setLaysName(String laysName) {
        this.laysName = laysName;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public int gettColor() {
        return tColor;
    }

    public void settColor(int tColor) {
        this.tColor = tColor;
    }
}
