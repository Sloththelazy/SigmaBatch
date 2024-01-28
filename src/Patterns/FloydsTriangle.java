package Patterns;

import java.util.Scanner;

public class FloydsTriangle {
    public static void FloydsTriangle (int rows){

        int numbersToBePrinted = 1 ;
        for (int i = 1; i <= rows ; i++) {

            for (int j = 1 ; j <= i ; j++)
            {
                System.out.print((numbersToBePrinted++) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = scanner.nextInt() ;

        FloydsTriangle(rows) ;
    }
}
