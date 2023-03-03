package day05_tasks;

public class Output {

    public static void main(String[] args) {

        int i = 100;   // i is assigned to 100
        i = 10; //i reassigned to 10
        System.out.println(i);

        int l;
        int n;

        n = 100;  //n is assigned to 100
        l = n; // l is assigned to n --> =100
        System.out.println(l);

        int a, b, c;
        a = 10;
        b = 20;
        c = a;
        a = b;

        System.out.println(a); // 20 because a was reassigned at the end and java takes the last update.
        System.out.println(b);
        System.out.println(c);


    }
}
