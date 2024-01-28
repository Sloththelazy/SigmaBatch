package Patterns;

import java.util.Scanner;

public class solidRhombusPattern {
    public static void solidRhombusPattern (int rows){
        for(int i = 1 ;i <= rows ; i++){
            for (int spaces = 1 ; spaces <= rows-i ; spaces++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<= rows ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in) ;
        System.out.println("Enter the number of rows : ");
        int rows = scanner.nextInt();
        solidRhombusPattern(rows);
    }
}
