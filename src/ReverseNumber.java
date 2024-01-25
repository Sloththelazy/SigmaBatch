import java.util.Scanner;

public class ReverseNumber {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed : ");
        int n = sc.nextInt();
        int newNumber = 0;
        while (n != 0) {
            int temp = n % 10;
            newNumber = (newNumber * 10) + temp;
            n = n / 10;
        }
        System.out.println(newNumber);
    }
}
