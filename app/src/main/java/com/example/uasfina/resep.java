package com.example.uasfina;

import java.lang.reflect.Array;

public class resep {
    private String strMeal;
    private String strMealThumb;
    private String urlgambar;



    public resep(String strMeal, String strMealThumb) {
        this.strMeal = strMeal;
        this.strMealThumb = strMealThumb;
        this.urlgambar = urlgambar;
    }

    public resep() {
    }

    public String getStrMeal() {
        return strMeal;
    }

    public void setStrMeal(String strMeal) {
        this.strMeal = strMeal;
    }

    public String getStrMealThumb() {
        return strMealThumb;
    }

    public void setStrMealThumb(String strMealThumb) {
        this.strMealThumb = strMealThumb;
    }

    public String getUrlgambar() {
        return urlgambar;
    }

    public void setUrlgambar(String urlgambar) {
        this.urlgambar = urlgambar;
    }

}
