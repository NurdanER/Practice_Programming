package day10_tasks;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;


        System.out.println("Enter a month number ");
        int monthNumber= input.nextInt();
        String message ="";

switch (monthNumber){
    case 2:
        message= "February has 28 days";
        break;
    case 4:
        message = "April has 30 days";
        break;
    case 6:
        message = "June has 30 days";
        break;
    case 9:
        message = "September has 30 days";
        break;
    case 11:
        message= "November has 30 days";
        break;

    case 1:
        message="January has 30 days";
        break;
    case 3:
        message="March has 31 days";
        break;
    case 5:
        message= "May has 31 days";
        break;
    case 7:
        message = "July has 31 days";
        break;
    case 8:
        message = "August has 31 days";
        break;
    case 10:
        message = "October has 31 days";
        break;
    case 12:
        message = "31 days";
        break;
    default:
        System.out.println(monthNumber + " is invalid ");


}


        System.out.println(message);




















    }
}
