package com.myapp.test.model;

public class Diet {

    int d_no;

    private String email;

    int recipe_id1;

    int recipe_id2;

    int recipe_id3;

    private String diet_name;

    private String diet_ex;

    private String keyword;

    int d_view_num;

    private String imgd;

    public String getImgd() {
        return imgd;
    }

    public void setImgd(String imgd) {
        this.imgd = imgd;
    }

    public int getD_no() {
        return d_no;
    }

    public void setD_no(int d_no) {
        this.d_no = d_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRecipe_id1() {
        return recipe_id1;
    }

    public void setRecipe_id1(int recipe_id1) {
        this.recipe_id1 = recipe_id1;
    }

    public int getRecipe_id2() {
        return recipe_id2;
    }

    public void setRecipe_id2(int recipe_id2) {
        this.recipe_id2 = recipe_id2;
    }

    public int getRecipe_id3() {
        return recipe_id3;
    }

    public void setRecipe_id3(int recipe_id3) {
        this.recipe_id3 = recipe_id3;
    }

    public String getDiet_name() {
        return diet_name;
    }

    public void setDiet_name(String meal_name) {
        this.diet_name = meal_name;
    }

    public String getDiet_ex() {
        return diet_ex;
    }

    public void setDiet_ex(String meal_ex) {
        this.diet_ex = meal_ex;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getD_view_num() {
        return d_view_num;
    }

    public void setD_view_num(int d_view_num) {
        this.d_view_num = d_view_num;
    }
}
