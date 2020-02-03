import java.io.*;  
import java.util.Scanner;

public class filereader
{
    public static void main(String [] args) throws Exception{

        System.out.println("Type the letter you'd like to print out words starting with:");
        
        Scanner scan1 = new Scanner(System.in);
        String chosenletter= scan1.next();
                
        Scanner scan = new Scanner(new File("words.txt"));  // The file name is in the quotation marks
        while (scan.hasNext()) {  
           String nextword = scan.next();
           String firstletter= nextword.substring(0,1);
           if(firstletter.equalsIgnoreCase(chosenletter)){
               System.out.println(nextword);
           
            
           }
        

        }
    }
}