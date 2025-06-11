class Customer extends Exception {
    public Customer(String m) {
        super(m);
    }
}


public class day9task13 {
    public static void main(String args[]) {
        try {
            throw new Customer("This is a custom exception");
        } catch (Customer ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}
