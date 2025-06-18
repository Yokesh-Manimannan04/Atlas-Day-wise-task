import java.io.*;
import java.util.*;
public class day10task17
{
    public static void main(String args[]) {
        FileOutputStream outfile = null;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the text");
        String s = sc.nextLine();
        byte b1[] = s.getBytes();
        try
        {
            outfile = new FileOutputStream("FileName02.txt");
            outfile.write(b1);
        }
        catch(IOException e)
        {
            System.out.println(e);
            System.exit(-1);
        }
        System.out.println("Write Byte");
        System.out.println("Thank You...!!!");
    }
}
