package com.example.laysappui;

public class LaysModal {

    private String laysName;
    private int imgId;

    public LaysModal(String laysName, int imgId) {
        this.laysName = laysName;
        this.imgId = imgId;
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
}
