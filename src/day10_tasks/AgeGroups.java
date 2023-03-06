package day10_tasks;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        double age = input.nextDouble();
        String message = "";




            if (age>=0 && age< 1) {
                message="They are Infant.";
            }else if (age >=3 && age<=5){
                message="They are Toddler.";
            }else if (age >=6 && age<=9){
                message="They are Kid.";
            }else if (age >=10 && age<=12){
                message="They are Pre-Teen.";
            }else if (age >=13 && age<=17){
                message="They are Teenager.";
            }else if (age >=18 && age<=20){
                message="They are Young Adult.";
            }else if (age >=21 && age<=35){
                message="They are Adult.";
            }else if (age >=35 && age<=55){
                message="They are Middle-Age Adult.";
            }else if (age >55 &&age <=120){
                message="They are Senior Citizen.";
            }else{
                message="Invalid entry";
            }






        System.out.println(message);




    }
}
