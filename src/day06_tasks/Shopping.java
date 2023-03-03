package day06_tasks;

public class Shopping {
    public static void main(String[] args) {

        int numberOfItems = 0;
        double price = 0.0;


        System.out.println("I have "+numberOfItems+" in the cart");
        System.out.println("We pick up 1 water");
        ++numberOfItems;
        System.out.println("How many items in the cart: "+numberOfItems);
        price+=2.5;  //price = 0+2.5; long version
        System.out.println("Price "+price);
        System.out.println("We pick up 2 eggs");
        ++numberOfItems;
        System.out.println("How many items in the cart: "+numberOfItems);



    }
}
