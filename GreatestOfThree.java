import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();
        if (a > b && a > c) {
            System.out.println("The greatest number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("The greatest number is: " + b);
        } else if (c > a && c > b) {
            System.out.println("The greatest number is: " + c);
        } else {
            System.out.println("Two or more numbers are equal and greatest.");
        }

        scanner.close();
    }
}
