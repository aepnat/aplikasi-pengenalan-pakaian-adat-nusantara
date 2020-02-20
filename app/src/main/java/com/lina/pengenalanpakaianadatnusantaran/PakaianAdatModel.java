package com.lina.pengenalanpakaianadatnusantaran;

import java.io.Serializable;

public class PakaianAdatModel implements Serializable {

    private int image;
    private String title;
    private String desc;
    private String content;

    public PakaianAdatModel(int image, String title, String desc, String content) {
        this.image = image;
        this.title = title;
        this.desc = desc;
        this.content = content;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
