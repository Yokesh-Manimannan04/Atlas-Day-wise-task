import java.io.*;
public class day10task15
{
    public static void main(String args[])
    {
        File f1=new File("FileName01.txt");
        FileOutputStream outfile = null;
        byte[] Text= {'I',' ','L','O','V','E',' ','I','N','D','I','A'};
        try
        {
            outfile = new FileOutputStream(f1);
            outfile.write(Text);
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
