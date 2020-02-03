import java.io.*;  
import java.util.Scanner;

public class FileAdder
{
    public static void main(String [] args) throws Exception{
       
        Scanner scan = new Scanner(new File("nums.txt"));  // The file name
        // is in the quotation marks
        double sum = 0;

        while (scan.hasNext()) {  
            
            double next = scan.nextDouble();
            sum = sum+next ;
           
        }
        System.out.println("total = "+sum);

    }
}