package Patterns;

import java.util.Scanner;

public class DiamondPattern {
    public static void DiamondPatternFunction(int rows){
        for ( int i = 1 ;i <= rows ; i++ )
        {
            for (int j = 1 ; j <= (rows-i) ; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1 ; j <= ((2*i)-1) ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for ( int i = rows ;i >= 0; i-- )
        {
            /*
            Two major changes have been made to invert the pattern above
            1. the outer loop will run from rows to 0 hence , the spaces loop will print no space in the first iteration as required in the pattern and then 1 space will be printed eventually rising to 3 if the  rows = 4
            2.  if the rows required by the user is = 4 then in  the inverted pattern , first 7 stars need to be printed hence for the formula 2* rows -1 to work we need i == rows == 4 and hence,
             here as well we get a perk of using the outer loop in reverse

             */
            for (int spaces = 1 ; spaces <= (rows-i) ; spaces++)
            {
                System.out.print(" ");
            }
            for (int j = 1 ; j <= ((2*i)-1) ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed : ");
        int rows = scanner.nextInt();

        DiamondPatternFunction(rows);
    }
}
