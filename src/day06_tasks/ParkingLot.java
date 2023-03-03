package day06_tasks;

public class ParkingLot {

    public static void main(String[] args) {

int cars = 10;
String word1 = "There are ";
String word2 = " cars in the Parking Lot";
String word3 = "2 more cars drive in";

        System.out.println(word1 + cars + word2);
        System.out.println();
        System.out.println(word3);

        cars ++; cars++;  // cars = cars+2;    ----each increment increases it by one.
        System.out.println(word1 + cars + word2);
        cars = cars-5; // 5 cars left
        System.out.println(word1 + cars + word2);




    }
}
