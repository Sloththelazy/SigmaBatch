package Patterns;
/*
In advanced patterns problems visualize the pattern in the form of rows and columns and allocate it with a coordinate for example (row , column)
 */


import java.util.Scanner;

public class HollowRectangle {

    public static void hollowRectangle(int totalRows, int totalColumns) {
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= totalColumns; j++) {
                if (i == 1 || i == totalRows || j == 1 || j == totalColumns) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length and breath of the rectangle : ");
        int length = scanner.nextInt();
        int breath = scanner.nextInt();

        /*
        We will only print all the stars when  the coordinates are (1,1) to (1,5) and (4,1) to (4,5)
         */

        hollowRectangle(length, breath);
    }
}
