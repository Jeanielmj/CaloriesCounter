package com.example.demouser.caloriescounter;

/**
 * Created by demouser on 1/13/17.
 */

public class food {

    String name;
    int calories;
    boolean containsNuts;
    boolean vegan;
    boolean halal;

    public food(){
        this.name = null;
    }

    public food(String name, int calories, boolean containsNuts, boolean vegan, boolean halal){
        this.name = name;
        this.calories = calories;
        this.containsNuts = containsNuts;
        this.vegan = vegan;
        this.halal = halal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isContainsNuts() {
        return containsNuts;
    }

    public void setContainsNuts(boolean containsNuts) {
        this.containsNuts = containsNuts;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    public boolean isHalal() {
        return halal;
    }

    public void setHalal(boolean halal) {
        this.halal = halal;
    }

}