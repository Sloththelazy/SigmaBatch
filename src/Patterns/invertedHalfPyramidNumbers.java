package Patterns;

import java.util.Scanner;

public class invertedHalfPyramidNumbers {

    public static void InvertedHalfPyramidOfNumbers (int rows)
    {
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1 ; j <= rows - i +1 ;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = scanner.nextInt() ;


        InvertedHalfPyramidOfNumbers(rows);
    }
}
