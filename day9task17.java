class OuterClass {
    int x = 10;
    static class InnerClass {
        int y = 5;
    }
}
public class day9task17 {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();  // Static inner class doesn't need outer object
        System.out.println(myInner.y + myOuter.x);
    }
}
