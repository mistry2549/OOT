package test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you base: ");
        int b = sc.nextInt();

        System.out.print("Enter you exponent: ");
        int e = sc.nextInt();

        sc.close();

        int r = test1.calculatePower(b, e);
        System.out.printf("you result is %d", r);
    }

    public static int calculatePower(int base, int exponent) {
        int result = 1;
        for (int i = 1; i<=exponent; i++){
            result = result * base;
        }

        return result;
    }
}
