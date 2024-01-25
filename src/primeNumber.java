import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be checked : ");
        int number = scanner.nextInt();

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0 && number != 2) {
                System.out.println("Number is composite number");
                return;
            }
        }
        System.out.println("Number is a prime number");
    }
}
