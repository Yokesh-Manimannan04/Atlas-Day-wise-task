public class NameArray {
    public static void main(String[] args) {
        char[] name = {'Y', 'O', 'K', 'E', 'S', 'H'};
        System.out.println(name);
        int n = name.length;
        System.out.println("There are " + n + " letters in my name.");
        System.out.println("Each letter in my name:");
        for (int i = 0; i < n; i++) {
            System.out.println(name[i]);
        }
    }
}
