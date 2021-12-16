package Lesson6;

public class Cat extends Animals{

    public static int CatNumb = 0;

    public Cat(String name, int age, String color) {
        super(name, age, color);
        CatNumb++;
    }

    @Override
    public void run(int distance) {

        if (distance>200){
            System.out.println("Коты так далеко не бегают");
        }else{
        super.run(distance);}
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать(");
    }
}
