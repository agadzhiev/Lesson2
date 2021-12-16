package Lesson6;

public class Animals {
    protected String name;
    protected int age;
    protected String color;

    public static int numb = 0;



    public Animals(String name, int age, String color){
            this.name = name;
            this.age = age;
            this.color = color;
            numb++;

    }
    public void run(int distance)
    {
        System.out.println(getName() + " пробежал " + distance);
    }

    public void swim(int distance)
    {
        System.out.println(getName() + " проплыл " + distance);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
