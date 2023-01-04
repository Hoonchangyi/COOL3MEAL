package com.myapp.test.model;

import java.util.ArrayList;
import java.util.List;

public class MyfridgeSearch {
    private List<String> txtData0 = new ArrayList<>();
//    private String txtData1;
//    private String txtData2;
//    private String txtData3;
//    private String txtData4;
//    private String txtData5;
//    private String txtData6;
//    private String txtData7;
//    private String txtData8;
//    private String txtData9;
    int recipe_id;
    private String recipe_nm_ko;
    private String img;

    public List<String> getTxtData0() {
        return txtData0;
    }

    public void setTxtData0(List<String> txtData0) {
        this.txtData0 = txtData0;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
