import java.io.*;
interface testInterface {
    int a = 10;
    void display();
}
class TestClass implements testInterface {
    public void display() {
        System.out.println("Myclass");
    }
}
class MyClass {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
        System.out.println(testInterface.a);
    }
}
