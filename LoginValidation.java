import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctId = "yokesh";
        String correctPwd = "yokesh";

        String enteredId = "";
        String enteredPwd = "";

        while (!(enteredId.equals(correctId) && enteredPwd.equals(correctPwd))) {
            System.out.print("Enter Login ID: ");
            enteredId = scanner.nextLine();

            System.out.print("Enter Password: ");
            enteredPwd = scanner.nextLine();

            if (!(enteredId.equals(correctId) && enteredPwd.equals(correctPwd))) {
                System.out.println("Invalid ID or Password. Please try again.\n");
            }
        }
        System.out.println("\nLogin successful!");
        scanner.close();
    }
}

