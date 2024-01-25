package Patterns;

import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in) ;
        System.out.println("Enter the number of rows to be printed : ");
        int rows = scanner.nextInt() ; char ch = 'A' ;

        for (int i = 1; i <= rows ; i++) {
            for (int j = 1 ; j <= i ; j++)
            {
                System.out.print(ch + " ");
                ch++ ;
            }
            System.out.println();
        }
    }
}
