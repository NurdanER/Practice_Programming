package day08_tasks;

import java.util.Scanner;

public class Divisible {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();
        String isDivisibleBy = " is divisible by ";
        boolean isDivisibleBy2 = number % 2 == 0;
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;

        System.out.println();

        System.out.println(number + isDivisibleBy + "2: " + isDivisibleBy2 + "\n" + number +
                isDivisibleBy + "3: " + isDivisibleBy3 + "\n" + number + isDivisibleBy + "5: " + isDivisibleBy5);















    }



}
