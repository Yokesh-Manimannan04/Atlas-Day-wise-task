import java.util.Scanner;
public class login{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter your Password: ");
        String pwd = scanner.nextLine();
        System.out.println("\nHI,");
        System.out.println("your logi id is" + id);
        System.out.println("your password is" + pwd);
        scanner.close();
    }
}
