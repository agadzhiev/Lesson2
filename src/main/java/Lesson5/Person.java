package Lesson5;

public class Person {
    private String name;
    private String position;
    private String email;
    private String tel;
    private int salary;
    private int age;



    public Person(String name, String position, String email, String tel, int salary, int age) {
        this.name= name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public Person(String name) {
        this(name, "default", "default@mail.ru", "0000", 100, 30);
    }


    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s позиция: %s, email: %s, tel: %s, заработная плата: %d, возраст: %d", name, position, email, tel, salary, age);
    }


}
