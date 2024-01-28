package Patterns;

import java.util.Scanner;

public class hollowRhombus {
public static void HollowRhombus (int rows){
    /*
    Hollow rhombus is = spaces + code for hollow rectangle
     */
    for ( int i = 1 ; i <= rows ; i++){
         /*
         we will first print the number of spaces and then the hollow rectangle
          */
        for (int j = 1 ; j<= (rows-i) ; j++)
        {
            System.out.print(" ");
        }
        for (int k = 1 ; k <= rows ; k++)
        {
            if(i == 1 || i == rows || k == 1 || k == rows)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();

    }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed : ");
        int rows = scanner.nextInt() ;

        HollowRhombus(rows);
    }
}
