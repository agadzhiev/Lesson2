package Lesson5;

public class Main {
    public static void main(String[] args) {
     Person[] persArray =  new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Sidorov Egor", "Director", "sidor@mailbox.com", "892315434", 50000, 47);
        persArray[2] = new Person("Antonov Oleg", "Producer", "antant@mailbox.com", "892221212", 40000, 40);
        persArray[3] = new Person("Petrov Dmitriy", "Cameraman", "pertdim@mailbox.com", "892123312", 35000, 41);
        persArray[4] = new Person("Nikitin Ivan", "Ligther", "nikiva@mailbox.com", "892310001", 20000, 23);

        for (Person person: persArray) {
            if ( person.getAge()  >= 40){
                System.out.println(person);}
        }


    }
}
