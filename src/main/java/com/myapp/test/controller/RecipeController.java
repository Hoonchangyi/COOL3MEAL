package com.myapp.test.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.myapp.test.model.*;
import com.myapp.test.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
public class RecipeController {

    @Autowired
    private RecipeService recipeService;



    @GetMapping(value = "/home")
    @CrossOrigin(origins = "http://localhost:3000")
    public List viewRecipe() {
        List<Recipe> viewRecipe = recipeService.getLikeRecipe();
        List<Recipe> newRecipe = recipeService.getNewRecipe();
        List<Diet> viewDiet = recipeService.getLikeDiet();

        List joind = new ArrayList<>();
        joind.addAll(viewRecipe);
        joind.addAll(newRecipe);
        joind.addAll(viewDiet);

        return joind;
    }

    @GetMapping(value = "/detail_recipe")
    @CrossOrigin(origins = "http://localhost:3000")
    public List detail_recipe(@RequestParam(value = "recipe_id") int recipe_id){
        List<Detail> detailRecipe = recipeService.getDetailRecipe(recipe_id);
        List<Detail> detailOrder = recipeService.getDetailOrder(recipe_id);

        List detail_recipe = new ArrayList<>();

//        System.out.println(recipe_id);
//        System.out.println(detailRecipe);
//        System.out.println(detailOrder);
//        System.out.println(irdny);

        detail_recipe.addAll(detailRecipe);
        detail_recipe.addAll(detailOrder);

        return detail_recipe;
    }

    @GetMapping(value = "/detail_diet")
    @CrossOrigin(origins = "http://localhost:3000")
    public List detail_diet(@RequestParam(value = "d_no") int d_no){

        List<Diet> detailDiet = recipeService.getDetailDiet(d_no);
//        System.out.println(detailDiet.toString());

//        for(Diet data: detailDiet){
//            System.out.println(data.getDiet_name());
//            System.out.println(data.getDiet_ex());
//            System.out.println(data.getKeyword());
//        }

        return detailDiet;
    }

    @RequestMapping(value = "/search1")
    @JsonProperty("recipe_nm_ko")
    @CrossOrigin(origins = "http://localhost:3000")
    public List SearchRecipe(@RequestBody final Search recipe_nm_ko){//레시피 검색

        List<Detail> searchRecipe = recipeService.getSearchRecipe(recipe_nm_ko.getRecipe_nm_ko());

        return searchRecipe;
    }

    @RequestMapping(value = "/search2")
    @JsonProperty("recipe_nm_ko")
    @CrossOrigin(origins = "http://localhost:3000")
    public List SearchDiet(@RequestBody final Search diet_name){

        List<Diet> searchDiet = recipeService.getSearchDiet(diet_name.getDiet_name());

        return searchDiet;
    }

    @RequestMapping(value = "/find_recipe1", method = {RequestMethod.POST})
    @JsonProperty("recipe_nm_ko")
    @CrossOrigin(origins = "http://localhost:3000")
    public List find_recipe1(@RequestBody final Search recipe_nm_ko){
        List<Detail> findRecipe = recipeService.getSearchRecipe(recipe_nm_ko.getRecipe_nm_ko());

        return findRecipe;
    }

    @RequestMapping(value = "/find_recipe2", method = {RequestMethod.POST})
    @JsonProperty("recipe_nm_ko")
    @CrossOrigin(origins = "http://localhost:3000")
    public List find_recipe2(@RequestBody final Search recipe_nm_ko){
        List<Detail> findRecipe = recipeService.getSearchRecipe(recipe_nm_ko.getRecipe_nm_ko());

        return findRecipe;
    }


    @RequestMapping(value = "/find_recipe3", method = {RequestMethod.POST})
    @JsonProperty("recipe_nm_ko")
    @CrossOrigin(origins = "http://localhost:3000")
    public List find_recipe3(@RequestBody final Search recipe_nm_ko){
        List<Detail> findRecipe = recipeService.getSearchRecipe(recipe_nm_ko.getRecipe_nm_ko());

        return findRecipe;
    }

    @RequestMapping(value = "/find_recipe1-1", method = {RequestMethod.POST})
    @JsonProperty("recipe_nm_ko")
    @CrossOrigin(origins = "http://localhost:3000")
    public List find_recipe1_1(@RequestBody final Search recipe_nm_ko){
        List<Detail> findRecipe = recipeService.getSearchRecipe(recipe_nm_ko.getRecipe_nm_ko());

        return findRecipe;
    }

    @RequestMapping(value = "/find_recipe2-1", method = {RequestMethod.POST})
    @JsonProperty("recipe_nm_ko")
    @CrossOrigin(origins = "http://localhost:3000")
    public List find_recipe2_1(@RequestBody final Search recipe_nm_ko){
        List<Detail> findRecipe = recipeService.getSearchRecipe(recipe_nm_ko.getRecipe_nm_ko());

        return findRecipe;
    }


    @RequestMapping(value = "/find_recipe3-1", method = {RequestMethod.POST})
    @JsonProperty("recipe_nm_ko")
    @CrossOrigin(origins = "http://localhost:3000")
    public List find_recipe3_1(@RequestBody final Search recipe_nm_ko){
        List<Detail> findRecipe = recipeService.getSearchRecipe(recipe_nm_ko.getRecipe_nm_ko());

        return findRecipe;
    }

    @RequestMapping(value = "/create", method = {RequestMethod.POST})
    @CrossOrigin(origins = "http://localhost:3000")
    public int diet_create(@RequestBody final Diet diet){

        if(this.recipeService.insertDiet(diet) != 0){
            return 1;
        }

        else {
            return 2;
        }

    }

    @RequestMapping(value = "/insertIngredient", method = {RequestMethod.POST})
    @CrossOrigin(origins = "http://localhost:3000")
    public int insertIngredient(@RequestBody final Refrigerator refrigerator){

        if(this.recipeService.insertIngredient(refrigerator) != 0){
            return 1;
        }

        else {
            return 2;
        }
    }

    @RequestMapping(value = "/myfridge", method = {RequestMethod.POST})
    @JsonProperty("email")
    @CrossOrigin(origins = "http://localhost:3000")
    public List myfridge(@RequestBody final Refrigerator email) {
//        System.out.println(email.getEmail());

        List<Refrigerator> myfridge = recipeService.getRefrigerator(email.getEmail());

//        System.out.println(myfridge.get(0).getIngredientName());
//        System.out.println(myfridge.get(0).getShelflife());
        return myfridge;
    }

    @RequestMapping(value = "/delIngredient", method = {RequestMethod.POST})
    @CrossOrigin(origins = "http://localhost:3000")
    public int delIngredient(@RequestBody final Refrigerator refrigerator){

        if(this.recipeService.delIngredient(refrigerator) != 0){
            return 1;
        }

        else {
            return 2;
        }
    }

    @RequestMapping(value = "/updateIngredient", method = {RequestMethod.POST})
    @CrossOrigin(origins = "http://localhost:3000")
    public int updateIngredient(@RequestBody final Refrigerator refrigerator){

        if(this.recipeService.updateIngredient(refrigerator) != 0){
            return 1;
        }

        else {
            return 2;
        }
    }

    @RequestMapping(value = "/myfridgeSearch")
    @CrossOrigin(origins = "http://localhost:3000")
    public List myfridgeSearch(@RequestBody final MyfridgeSearch myfridgeSearch){
        List<String> txtData = myfridgeSearch.getTxtData0();
        int itemLen = txtData.size();
        System.out.println("선택한 재료 이름 : " + txtData);
        System.out.println("선택한 재료 갯수 : " + itemLen);

        if(itemLen==1){
            List<MyfridgeSearch> myfridgeSearches1 = recipeService.getmyfridgeSearch1(myfridgeSearch);
            return myfridgeSearches1;
        }
        else if(itemLen==2){
            List<MyfridgeSearch> myfridgeSearches2 = recipeService.getmyfridgeSearch2(myfridgeSearch);
            return myfridgeSearches2;
        }
        else if(itemLen==3){
            List<MyfridgeSearch> myfridgeSearches3 = recipeService.getmyfridgeSearch3(myfridgeSearch);
            return myfridgeSearches3;
        }
        else if(itemLen==4){
            List<MyfridgeSearch> myfridgeSearches4 = recipeService.getmyfridgeSearch4(myfridgeSearch);
            return myfridgeSearches4;
        }
        else if(itemLen==5){
            List<MyfridgeSearch> myfridgeSearches5 = recipeService.getmyfridgeSearch5(myfridgeSearch);
            return myfridgeSearches5;
        }
        else if(itemLen==6){
            List<MyfridgeSearch> myfridgeSearches6 = recipeService.getmyfridgeSearch6(myfridgeSearch);
            return myfridgeSearches6;
        }
        else if(itemLen==7){
            List<MyfridgeSearch> myfridgeSearches7 = recipeService.getmyfridgeSearch7(myfridgeSearch);
            return myfridgeSearches7;
        }
        else if(itemLen==8){
            List<MyfridgeSearch> myfridgeSearches8 = recipeService.getmyfridgeSearch8(myfridgeSearch);
            return myfridgeSearches8;
        }
        else if(itemLen==9){
            List<MyfridgeSearch> myfridgeSearches9 = recipeService.getmyfridgeSearch9(myfridgeSearch);
            return myfridgeSearches9;
        }
        else if(itemLen==10){
            List<MyfridgeSearch> myfridgeSearches10 = recipeService.getmyfridgeSearch10(myfridgeSearch);
            return myfridgeSearches10;
        }else {
            return null;
        }
    }

    @RequestMapping(value = "/mypage", method = {RequestMethod.POST})
    @JsonProperty("email")
    @CrossOrigin(origins = "http://localhost:3000")
    public List mypage(@RequestBody final Diet email) {
//        System.out.println(email.getEmail());

        List<Diet> mypage = recipeService.getMyLikeDiet(email.getEmail());

//        System.out.println(myfridge.get(0).getIngredientName());
//        System.out.println(myfridge.get(0).getShelflife());
        return mypage;
    }

    @RequestMapping(value = "/delDiet", method = {RequestMethod.POST})
    @CrossOrigin(origins = "http://localhost:3000")
    public int delDiet(@RequestBody final Diet diet){

        if(this.recipeService.delDiet(diet) != 0){
            return 1;
        }

        else {
            return 2;
        }
    }

    @RequestMapping(value = "/updateDiet", method = {RequestMethod.POST})
    @CrossOrigin(origins = "http://localhost:3000")
    public int updateDiet(@RequestBody final Diet diet){
        if(this.recipeService.updateDiet(diet) != 0){
            System.out.println("ok");

            return 1;
        }

        else {
            System.out.println(diet.getDiet_name());

            return 2;

        }
    }

}