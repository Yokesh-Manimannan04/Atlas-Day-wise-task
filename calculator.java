class Calculator {
    public static int add(int a, int b)
    {
        return a + b;
    }
    public static int subtract(int a, int b)
    {
        return a - b;
    }
    public static int multiply(int a, int b)
    {
        return a * b;
    }
    public static int divide(int a, int b)
    {
        if (b == 0){
            System.out.println("cannot divide by zero");
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args){
        int num1 = 20;
        int num2 = 5;

        System.out.println("Sum of 2 numbers is" + add(num1, num2));
        System.out.println("Diff of 2 numbers is" + subtract(num1, num2));
        System.out.println("Product of 2 numbers is" + multiply(num1, num2));
        System.out.println("Division of 2 numbers is" + divide(num1, num2));
    }
}