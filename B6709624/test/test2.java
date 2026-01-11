package test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter you number: ");
        int number = sc.nextInt();

        sc.close();

        int r = test2.sumOfDigits(number);

        System.err.printf("your result: %d", r);
    }

    public static int sumOfDigits(int i){
        int sum = 0;

        while(i > 0){
            int lastdigit=i%10;

            sum = sum + lastdigit;

            i=i/10;
        }

        return sum;
    }
}
