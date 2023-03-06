package day10_tasks;


import java.util.Scanner;

public class GiftCard {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double giftCard = 100, blanket = 60, charger = 25, hat = 25, headphones = 30, laptop = 200, pants = 50, pillow = 40, smartphone = 1000, socks = 5, usbCable = 10;
            double giftCardBalance = 100;
            double leftoverHatPrice = giftCardBalance - hat;
            double leftoverPantsPrice = giftCardBalance - pants;
            String message1 = "Thank you for your purchase !";
            String message2 = "Invalid item!";


            if (giftCardBalance >= hat) {
                System.out.println("What would you like to buy today? ");
                String itemName = input.next();
                System.out.println(message1);
                System.out.println("Your current balance is : $" + leftoverHatPrice);
               if (giftCardBalance >= pants) {
                   System.out.println("What would you like to buy today? ");
                   String itemName1 = input.next();
                   System.out.println(message1);
                   System.out.println("Your current balance is : $" + leftoverPantsPrice);
               }

            }else{
                   System.out.println(message2);
               }


        }
    }


