package day10_tasks;

import java.util.Scanner;

public class GiftCard2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter what do you wanna buy:");
        String item = input.next();

        double giftCard = 100, blanket = 60, charger = 25, hat = 25, headphones = 30, laptop = 200, pants = 50, pillow = 40, smartphone = 1000, socks = 5, usbCable = 10;
        double purchase;

        switch (item){
            case "blanket":
                System.out.println("Thank you for your purchase!\nYour current balance is:" + (giftCard-blanket));break;
            case "charger":
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard-charger));break;
            case "hat":
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard-hat));break;
            case "headphones":
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard-headphones));break;
            case "laptop":
                System.out.println("Sorry, not enough funds on your gift card!");break;
            case "pants":
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard-pants));break;
            case "pillow":
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard-pillow));break;
            case "smartphone":
                System.out.println("Sorry, not enough funds on your gift card!");break;
            case "socks":
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard-pants));break;
            case "usbCable":
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard-usbCable));break;
            default  :
                System.out.println("Invalid item!");
        }













    }


}
