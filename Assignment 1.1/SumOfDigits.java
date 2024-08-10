import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = scanner.nextInt();
        int sum = 0;
        int originalNumber = number;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("The sum of digits in " + originalNumber + " is " + sum);
    }
}