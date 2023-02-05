package org.example.item2.javabeans;

// 코드 2-2 자바빈즈 패턴 - 일관성이 깨지고, 불변으로 만들 수 없다.
// 객체 생성이 간단해진다.
public class NutritionFacts {
    private int servingSize = -1; // Required
    private int servings = -1; // Required
    private int calories = 0; // Option
    private int fat = 0; // Option
    private int sodium = 0; // Option
    private int carbohydrate = 0; // Option

    public NutritionFacts() {
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public NutritionFacts(int calories, int fat, int sodium) {
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
    }

    public static void main(String[] args) {

        // Required : sodium, Fat, calories
        NutritionFacts nutritionFacts = new NutritionFacts(1, 1, 1);
        nutritionFacts.setServings(1);



    }
}
