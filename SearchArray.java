import java.io.*;
import java.util.Scanner;

public class SearchArray{
    static int count=0;
    static int middle=0;
    static int min=0;
    static int max=0;
    static int range=0;
    static String input="0";
    static String[] words;
    static boolean found=false;
    public static void main(String [] args) throws Exception{
        int size=0;
        Scanner scan = new Scanner(new File("animals.txt"));
        while(scan.hasNext()){
            size++;
            scan.next();
        }
        words = new String [size];
        scan = new Scanner(new File("animals.txt"));
        while(scan.hasNext()){
            words[count] = scan.next();
            count++;
        }
        middle=count/2;
        max=count;
        range=max-min;
        System.out.println("Enter the name of the animal you'd like to search for:"+size);
        Scanner inputter = new Scanner(System.in);
        input=inputter.next();
        placer();
    }

    public static void placer(){
        while (found==false){
            if (input.compareToIgnoreCase(words[middle]) < 0) {
                max = middle - 1;
                middle = (min + max) / 2;
            }
            else if (input.compareToIgnoreCase(words[middle]) > 0) {
                min = middle + 1;
                middle = (min + max) / 2;
            }
            if (input.compareToIgnoreCase(words[middle]) == 0) {
                System.out.println("Your word was found in the array at index "+middle+".");
                found=true;
            }
            else if (max <= min) {
                System.out.println("Sorry, your word couldn't be found in the index.");
                found =true;
            }
        }
    }
}