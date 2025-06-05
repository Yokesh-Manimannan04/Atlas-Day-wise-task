public class task34 {
    public static void add(int x, int y) {
        System.out.println("x and y values: " + x + ", " + y);
    }
    public static void add(int x, int y, int z) {
        System.out.println("x, y, z values: " + x + ", " + y + ", " + z);
    }
    public static void main(String[] args) {
        add(10, 20, 30);
        add(50, 100);
    }
}

