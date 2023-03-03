package day09_tasks;

import java.util.Scanner;

public class TimInDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What time is it now");
        int hour = input.nextInt();

        if (hour< 12 && hour>1){
            System.out.println("Good Morning");
        }
        else if ( hour >= 12 && hour < 15 ){
            System.out.println("Good Afternoon");
        }
        else if (hour>0 || hour ==15){
            System.out.println("Good Evening");
        }
        else if (hour<0 || hour> 24){
            System.out.println("Invalid input!");
        }




    }
}
