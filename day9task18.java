class OuterClass {
    int x = 10;
    class InnerClass {
        int y = 5;
        int getOuterX() {
            return x;  // Directly allowed in non-static inner class
        }
    }
}
public class day9task18 {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println("Inner y + Outer x: " + (myInner.y + myInner.getOuterX()));
    }
}
