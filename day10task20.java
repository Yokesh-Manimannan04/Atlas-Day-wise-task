import java.io.*;

class CopyByte {
    public static void main(String args[]) {
        try {
            int b;
            FileInputStream infile = new FileInputStream("NewFile01.txt");
            FileOutputStream outfile = new FileOutputStream("NewFile05.txt");

            while ((b = infile.read()) != -1) {
                outfile.write(b);
            }

            System.out.println("Byte Copied From NewFile01.txt to NewFile05.txt");

            infile.close();
            outfile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
