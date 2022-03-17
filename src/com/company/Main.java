package com.company;

public class Main {

    public static void main(String[] args) {
     Person person1 = new Person("Sadyr");
     Person person2 = new Person("Askar");
     Person person3 = new Person("Kurmanbek");
     Person person4 = new Person("Roza");
     Person person5 = new Person("Almazbek");
     Person person6 = new Person("Sooronbai");
     Person person7 = new Person("Akylbek");
     Person person8 = new Person("Joomart");
     Person person9= new Person("Felix");
     Person person10 = new Person("Temir");

     Person[] apartment = {person1, person2, person3, person4};
     Person[] dormitory = {person5, person6, person7};
     Person[] hotel = {person8, person9, person10};
        int counter = 0;
        for (Person a : apartment) {
            counter++;
        }

        int counter1 = 0;
        for (Person b : dormitory) {
            counter1++;
        }
        int counter2 = 0;
        for (Person c : hotel) {
            counter2++;
        }
        Apartment apartment1= new Apartment("Manas Street #77",8000, apartment);
        System.out.println(apartment1);
        System.out.println("Lives: " + counter + " people");
        apartment1.toMakePayment();
        System.out.println("_____________________________________________________");

        Dormitory dormitory1 = new Dormitory("Tunguch 1", 5000, dormitory);
        System.out.println(dormitory1);
        System.out.println("Lives: " + counter1 + " people");
        dormitory1.toMakePayment();
        System.out.println("_________________________________________________________________");

        Hotel hotel1 = new Hotel("Kyiv #67", 1600, hotel);
        System.out.println(hotel1);
        System.out.println("Lives: " + counter2 + " people");
        hotel1.toMakePayment();
    }
}
