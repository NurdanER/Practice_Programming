package day10_tasks;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 number:");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

       if (num1>num2) {
           System.out.println(num1 + " is bigger than " + num2);
       }else if (num1<num2){
           System.out.println(num1 + " is smaller than " +num2);
       }else if (num2==num1) {
           System.out.println(num1 + " is equal to " + num2);
       }




















    }
}
