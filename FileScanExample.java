import java.io.*;  // Notice that you have to import more for files
import java.util.Scanner;

public class FileScanExample
{
    public static void main(String [] args) throws Exception{
       
        Scanner scan = new Scanner(new File("nums.txt"));  // The file name
        // is in the quotation marks

        while (scan.hasNext()) {  // When using files, you can use scan.hasNext()
            // which will return true if there are still tokens in the file
            double theNumber = scan.nextDouble();
            theNumber = theNumber * 2;
            System.out.println(theNumber);
        }

    }
}