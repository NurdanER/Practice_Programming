package day09_tasks;

import java.util.Scanner;

public class OceanDay {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("What is your current oxygen level of your tank?");
        int number = input.nextInt();
        if (number > 90){
            System.out.println("Your tank is full!");
        }
        else if (number > 80){
            System.out.println("Still okay");
        }
        else if (number > 70){
            System.out.println("Don't go too far");
             } else if (number > 60) {
                System.out.println("Start to head back");
        }  else if  (number > 50){
            System.out.println("Be careful now you are at 50%");
        }








        }
}
