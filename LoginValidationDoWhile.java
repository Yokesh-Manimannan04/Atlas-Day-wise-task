import java.util.Scanner;

public class LoginValidationDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctId = "yokesh";
        String correctPwd = "yokesh";

        String enteredId;
        String enteredPwd;

        do {
            System.out.print("Enter Login ID: ");
            enteredId = scanner.nextLine();

            System.out.print("Enter Password: ");
            enteredPwd = scanner.nextLine();

            if (!(enteredId.equals(correctId) && enteredPwd.equals(correctPwd))) {
                System.out.println("Invalid ID or Password. Please try again.\n");
            }

        } while (!(enteredId.equals(correctId) && enteredPwd.equals(correctPwd)));

        System.out.println("\nLogin successful!");
        scanner.close();
    }
}
