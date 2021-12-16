package Lesson6;

public class Main {


    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 5, "Рыжий");
        Dog dog1 = new Dog("Рекс", 7, "Черный");
        Cat cat2 = new Cat("Мурзик", 4, "Чернобелый");
        Dog dog2= new Dog("Гав", 1, "Рыжий");
        Cat cat3 = new Cat("Мяу", 2, "Белый");
        Dog dog3 = new Dog("Зевс", 2, "Белый");
        Dog dog4 = new Dog("Бобик>", 3, "Мульти");

        cat1.run(201);
        cat2.swim(10);


        System.out.println(Dog.DogNumb);
        System.out.println(Animals.numb);
        System.out.println(Cat.CatNumb);

    }




}
