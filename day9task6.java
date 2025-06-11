import java.io.*;

class MyClass {

    static void fun() throws IllegalAccessException {
        System.out.println("Inside fun().");
        throw new IllegalAccessException("demo");
    }

    static void method2() {
        int[] arr = new int[2];
        System.out.println("Accessing array element...");
        System.out.println(arr[5]);
    }

    static void method3() throws FileNotFoundException {
        System.out.println("Trying to open file...");
        FileReader file = new FileReader("nonexistentfile.txt");
    }

    public static void main(String args[]) {
        try {
            fun();
        } catch (IllegalAccessException e) {
            System.out.println("Caught IllegalAccessException in main: " + e);
        }
        try {
            method2();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException in main: " + e);
        }
        try {
            method3();
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException in main: " + e);
        }
    }
}
