package com.myapp.test.model;

import javax.validation.constraints.NotEmpty;

public class Recipe {
    int recipe_id;

    private String recipe_nm_ko;

    private String sumry;

    private String nation_code;

    private String nation_nm;

    private String ty_code;

    private String ty_nm;

    int cooking_time;

    int calorie;

    int qnt;

    private String level_nm;

    private String irdnt_code;

    int pc_nm;

    private String img;

//    int wdate;

    int like_num;

    private String irdnt;

    public String getIrdnt() {
        return irdnt;
    }

    public void setIrdnt(String irdnt) {
        this.irdnt = irdnt;
    }

    public int getRecipe_id() {
        return recipe_id;
    }

    public void setRecipe_id(int recipe_id) {
        this.recipe_id = recipe_id;
    }

    public String getRecipe_nm_ko() {
        return recipe_nm_ko;
    }

    public void setRecipe_nm_ko(String recipe_nm_ko) {
        this.recipe_nm_ko = recipe_nm_ko;
    }

    public String getSumry() {
        return sumry;
    }

    public void setSumry(String sumry) {
        this.sumry = sumry;
    }

    public String getNation_code() {
        return nation_code;
    }

    public void setNation_code(String nation_code) {
        this.nation_code = nation_code;
    }

    public String getNation_nm() {
        return nation_nm;
    }

    public void setNation_nm(String nation_nm) {
        this.nation_nm = nation_nm;
    }

    public String getTy_code() {
        return ty_code;
    }

    public void setTy_code(String ty_code) {
        this.ty_code = ty_code;
    }

    public String getTy_nm() {
        return ty_nm;
    }

    public void setTy_nm(String ty_nm) {
        this.ty_nm = ty_nm;
    }

    public int getCooking_time() {
        return cooking_time;
    }

    public void setCooking_time(int cooking_time) {
        this.cooking_time = cooking_time;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public String getLevel_nm() {
        return level_nm;
    }

    public void setLevel_nm(String level_nm) {
        this.level_nm = level_nm;
    }

    public String getIrdnt_code() {
        return irdnt_code;
    }

    public void setIrdnt_code(String irdnt_code) {
        this.irdnt_code = irdnt_code;
    }

    public int getPc_nm() {
        return pc_nm;
    }

    public void setPc_nm(int pc_nm) {
        this.pc_nm = pc_nm;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getLike_num() {
        return like_num;
    }

    public void setLike_num(int like_num) {
        this.like_num = like_num;
    }
}
