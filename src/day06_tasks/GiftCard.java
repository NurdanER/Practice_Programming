package day06_tasks;

public class GiftCard {

    public static void main(String[] args) {


        double balance = 200.0;
        double item1Price = 40.0;
        double item2Price = 100.0;
        double remainingCardBalance = balance-item1Price-item2Price;  //balance - (item1Price + item2Price); "made stupid way"
         String word1 = "The gift card started with a balance of ";
         String word2 = " and after buying item1 for ";
         String word3 = " and item2 for $";
         String word4 = " the remaining balance of the gird card is ";

        System.out.println(word1 + balance + word2 + item1Price + word3 + item2Price +  word4 +
                remainingCardBalance);


    }
}
