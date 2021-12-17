package Lesson7;

public class Plate {
    private int foodCount;

    public Plate (int foodCount){
        this.foodCount = foodCount;
    }

    public void printInfo(){
        System.out.println(this);
    }

    public void decreaseFood(int catEatFoodCount) {
        foodCount -= catEatFoodCount;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }
}
