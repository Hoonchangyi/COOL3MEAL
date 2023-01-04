package com.myapp.test.service;

import com.myapp.test.mapper.RecipeMapper;
import com.myapp.test.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("recipeService")
public class RecipeServiceImpl implements RecipeService{

    @Autowired
    private RecipeMapper recipeMapper;


    @Override
    public List<Recipe> getLikeRecipe() {
        return recipeMapper.getLikeRecipe();
    }

    @Override
    public List<Recipe> getNewRecipe() {
        return recipeMapper.getNewRecipe();
    }

    @Override
    public List<Detail> getDetailRecipe(int recipe_id) {
        // TODO Auto-generated method stu
        return recipeMapper.getDetailRecipe(recipe_id);
    }

    @Override
    public List<Detail> getDetailOrder(int recipe_id) {
        // TODO Auto-generated method stub
        return recipeMapper.getDetailOrder(recipe_id);
    }

    @Override
    public List<Diet> getLikeDiet() {
        return recipeMapper.getLikeDiet();
    }

    @Override
    public List<Diet> getDetailDiet(int d_no) {
        return recipeMapper.getDetailDiet(d_no);
    }

    @Override
    public List<Detail> getSearchRecipe(String recipe_nm_ko) {
        return recipeMapper.getSearchRecipe(recipe_nm_ko);
    }

    @Override
    public List<Diet> getSearchDiet(String diet_name) {
        return recipeMapper.getSearchDiet(diet_name);
    }

    @Override
    public int insertDiet(Diet diet) {
        return recipeMapper.insertDiet(diet);
    }

    @Override
    public int insertIngredient(Refrigerator refrigerator) {
        return recipeMapper.insertIngredient(refrigerator);
    }

    @Override
    public List<Refrigerator> getRefrigerator(String email) {
        return recipeMapper.getRefrigerator(email);
    }

    @Override
    public List<Refrigerator> getRefrigeratorLife(String email) {
        return recipeMapper.getRefrigeratorLife(email);
    }

    @Override
    public int delIngredient(Refrigerator refrigerator) {
        return recipeMapper.delIngredient(refrigerator);
    }

    @Override
    public int updateIngredient(Refrigerator refrigerator) {
        return recipeMapper.updateIngredient(refrigerator);
    }

    @Override
    public List<MyfridgeSearch> getmyfridgeSearch1(MyfridgeSearch myfridgeSearch) {
        return recipeMapper.getmyfridgeSearch1(myfridgeSearch);
    }

    @Override
    public List<MyfridgeSearch> getmyfridgeSearch2(MyfridgeSearch myfridgeSearch) {
        return recipeMapper.getmyfridgeSearch2(myfridgeSearch);
    }

    @Override
    public List<MyfridgeSearch> getmyfridgeSearch3(MyfridgeSearch myfridgeSearch) {
        return recipeMapper.getmyfridgeSearch3(myfridgeSearch);
    }

    @Override
    public List<MyfridgeSearch> getmyfridgeSearch4(MyfridgeSearch myfridgeSearch) {
        return recipeMapper.getmyfridgeSearch4(myfridgeSearch);
    }

    @Override
    public List<MyfridgeSearch> getmyfridgeSearch5(MyfridgeSearch myfridgeSearch) {
        return recipeMapper.getmyfridgeSearch5(myfridgeSearch);
    }

    @Override
    public List<MyfridgeSearch> getmyfridgeSearch6(MyfridgeSearch myfridgeSearch) {
        return recipeMapper.getmyfridgeSearch6(myfridgeSearch);
    }

    @Override
    public List<MyfridgeSearch> getmyfridgeSearch7(MyfridgeSearch myfridgeSearch) {
        return recipeMapper.getmyfridgeSearch7(myfridgeSearch);
    }

    @Override
    public List<MyfridgeSearch> getmyfridgeSearch8(MyfridgeSearch myfridgeSearch) {
        return recipeMapper.getmyfridgeSearch8(myfridgeSearch);
    }

    @Override
    public List<MyfridgeSearch> getmyfridgeSearch9(MyfridgeSearch myfridgeSearch) {
        return recipeMapper.getmyfridgeSearch9(myfridgeSearch);
    }

    @Override
    public List<MyfridgeSearch> getmyfridgeSearch10(MyfridgeSearch myfridgeSearch) {
        return recipeMapper.getmyfridgeSearch10(myfridgeSearch);
    }

    @Override
    public List<Diet> getMyLikeDiet(String email) {
        return recipeMapper.getMyLikeDiet(email);
    }

    @Override
    public int delDiet(Diet diet) {
        return recipeMapper.delDiet(diet);
    }

    @Override
    public int updateDiet(Diet diet) {
        return recipeMapper.updateDiet(diet);
    }
}
