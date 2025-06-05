public class task36 {
    void add(int x, float y) {
        System.out.println(x + ", " + y);
    }

    void add(float x, int y) {
        System.out.println(x + ", " + y);
    }

    public static void main(String[] args) {
        task36 task = new task36();
        task.add(10.50f, 60);
        task.add(100, 80.80f);
    }
}
