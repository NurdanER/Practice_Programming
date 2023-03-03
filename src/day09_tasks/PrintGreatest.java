package day09_tasks;

import java.util.Scanner;

public class PrintGreatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First number: ");
        int firstNumber = input.nextInt();
        System.out.print("Second number: " );
        int secondNumber = input.nextInt();
        System.out.print("Third number: ");
        int thirdNumber = input.nextInt();


        if (firstNumber>= secondNumber && firstNumber >= thirdNumber){
            System.out.println("The greatest number from " + firstNumber + "," + secondNumber +"," + thirdNumber + " is: " + firstNumber);
        }
        else if (secondNumber>= thirdNumber && secondNumber>= firstNumber){
            System.out.println("The greatest number from " + firstNumber + "," + secondNumber +"," + thirdNumber + " is: " + secondNumber);
        }
        else if (thirdNumber>=firstNumber && thirdNumber >= secondNumber){
            System.out.println("The greatest number from " + firstNumber + "," + secondNumber +"," + thirdNumber + " is: "+thirdNumber);
        }





    }
}
