import java.util.Scanner;

public class EvenAndOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1 ; int evenSum = 0 ; int oddSum = 0 ;
        do {
            System.out.println("Enter numbers : ");
            int  numbers = scanner.nextInt();

            if (numbers % 2 == 0)
            {
                evenSum += numbers;
            }
            else
            {
                oddSum +=numbers;
            }
            counter++ ;
        } while (counter <= 10) ;

        System.out.println("Even Sum : "+ evenSum +" Odd Sum :" + oddSum);
    }
}
