class Calculation {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("Sum: " + z);
    }

    public void subtraction(int x, int y) {
        z = x - y;
        System.out.println("Difference: " + z);
    }
}

interface Clock {
    void showTime();
}

class My_Calculation extends Calculation implements Clock {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("Product: " + z);
    }

    public void showTime() {
        System.out.println("Time is: 10:30 AM");
    }

    public static void main(String[] args) {
        My_Calculation demo = new My_Calculation();
        int a = 20, b = 10;
        demo.addition(a, b);
        demo.subtraction(a, b);
        demo.multiplication(a, b);
        demo.showTime();
    }
}
