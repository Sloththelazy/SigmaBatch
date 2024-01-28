package Patterns;

import java.util.Scanner;

public class invertedHalfPyramid {

    public static void invertHalfPyramid(int rows) {
        /*
        We will create three loops one for the number of lines
        2nd for the spaces before the stars
        3rd for printing the stars and will every row the number of spaces will decrease and the number of stars increases
         */
        for (int i = 1; i <= rows; i++) {
/*
for the number of rows we have the outer loop
 */
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
                /*
                for the number of spaces
                 */
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
                /*
                for the number of stars
                 */
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = scanner.nextInt();

        invertHalfPyramid(rows);
    }
}
