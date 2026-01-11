package test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you row: ");
        int row = sc.nextInt();

        sc.close();
        test3.drawpyramid(row);
    }
    public static void drawpyramid(int n) {
        for (int i = 1; i<=n; i++){
            for (int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            for (int k = 1; k<=(2*i-1); k++){
                System.err.print("*");
            }
            System.err.println();
        }
        
    }
}
