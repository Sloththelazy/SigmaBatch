package Patterns;

import java.util.Scanner;

public class invertedStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter the number of rows to be printed : ");
        int rows = scanner.nextInt() ;

        for(int i = rows; i > 0 ; i--)
        {
            for (int  j = 1 ; j <= i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
