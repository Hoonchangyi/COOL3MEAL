package com.myapp.test.service;

import com.myapp.test.model.*;

import java.util.List;

public interface RecipeService {
    List<Recipe> getLikeRecipe(); //select 조회수 높은

    List<Recipe> getNewRecipe(); // 새로 추가된

    List<Detail> getDetailRecipe(int recipe_id ); //아이디로 레시피 검색

    List<Detail> getDetailOrder(int recipe_id); //제작 과정

    List<Diet> getLikeDiet();

    List<Diet> getDetailDiet(int d_no);

    List<Detail> getSearchRecipe(String recipe_nm_ko);

    List<Diet> getSearchDiet(String diet_name);

    int insertDiet(Diet diet);

    int insertIngredient(Refrigerator refrigerator);

    List<Refrigerator> getRefrigerator(String email);

    List<Refrigerator> getRefrigeratorLife(String email);

    int delIngredient(Refrigerator refrigerator);

    int updateIngredient(Refrigerator refrigerator);

    List<MyfridgeSearch> getmyfridgeSearch1(MyfridgeSearch myfridgeSearch);

    List<MyfridgeSearch> getmyfridgeSearch2(MyfridgeSearch myfridgeSearch);


    List<MyfridgeSearch> getmyfridgeSearch3(MyfridgeSearch myfridgeSearch);


    List<MyfridgeSearch> getmyfridgeSearch4(MyfridgeSearch myfridgeSearch);


    List<MyfridgeSearch> getmyfridgeSearch5(MyfridgeSearch myfridgeSearch);


    List<MyfridgeSearch> getmyfridgeSearch6(MyfridgeSearch myfridgeSearch);


    List<MyfridgeSearch> getmyfridgeSearch7(MyfridgeSearch myfridgeSearch);


    List<MyfridgeSearch> getmyfridgeSearch8(MyfridgeSearch myfridgeSearch);


    List<MyfridgeSearch> getmyfridgeSearch9(MyfridgeSearch myfridgeSearch);


    List<MyfridgeSearch> getmyfridgeSearch10(MyfridgeSearch myfridgeSearch);

    List<Diet> getMyLikeDiet(String email);

    int delDiet(Diet diet);

    int updateDiet(Diet diet);

}
