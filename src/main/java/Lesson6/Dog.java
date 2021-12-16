package Lesson6;

public class Dog extends Animals{

    public static int DogNumb = 0;

    public Dog(String name, int age, String color) {
        super(name, age, color);
        DogNumb++;
    }

    @Override
    public void run(int distance) {
        if (distance>500){
            System.out.println("Собаки так далеко не бегают(");
        }else{
            super.run(distance);}
    }

    @Override
    public void swim(int distance) {
        if (distance>10){
            System.out.println("Собаки так далеко не заплывают(");
        }else{
            super.run(distance);}
    }
}
