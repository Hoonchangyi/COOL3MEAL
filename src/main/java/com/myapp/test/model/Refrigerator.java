package com.myapp.test.model;

import java.util.Date;

public class Refrigerator {

    private String email;
    int storeinfo;
    private String ingredientName;
    int numb;
    private String shelflife;
    private String img;

    private String writer_date;

    public String getWriter_date() {
        return writer_date;
    }

    public void setWriter_date(String writer_date) {
        this.writer_date = writer_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStoreinfo() {
        return storeinfo;
    }

    public void setStoreinfo(int storeinfo) {
        this.storeinfo = storeinfo;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public String getShelflife() {
        return shelflife;
    }

    public void setShelflife(String shelflife) {
        this.shelflife = shelflife;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
