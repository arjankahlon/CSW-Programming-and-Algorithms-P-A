import java.io.*;
import java.util.Scanner;

/**
 * FirstDatabase.java
 * Sorts words and associated numbers by numerical or alphabetical order based on a user's selection
 * @author Arjan Kahlon
 */   

public class FirstDatabase {
    public static void main(String[] args) throws Exception {
        int count = 0;
        int size = 0;

        Scanner filescan = new Scanner(new File("FirstDatabase.txt"));
        while(filescan.hasNextLine()) {
            size++;
            filescan.nextLine();
        }
        int[] numbers = new int[size];
        String[] words = new String[size];
        filescan.close();

        filescan = new Scanner(new File("FirstDatabase.txt"));
        while(filescan.hasNextLine()) {
            words[count] = filescan.next();
            numbers[count] = filescan.nextInt();
            count++;
        }
        filescan.close();

        String userinput = "";
        filescan = new Scanner(new File("FirstDatabase.txt"));        
        Scanner userscan = new Scanner(System.in);

        while(true) {
            System.out.println(" ");
            System.out.println("Input file: FirstDatabase.txt");
            System.out.println(" ");
            System.out.println("1-Word Order");
            System.out.println("2-Number Order");
            System.out.println("3-Exit");
            userinput = userscan.next();
            if(userinput.equals("1")) {
                sortstrings(words, numbers);
                printArrays(words, numbers);
            }
            else if (userinput.equals("2")) {
                numberSort(words, numbers);
                printArrays(words, numbers);
            }
            else if (userinput.equals("3")) {
                break;
            }
            else {
                System.out.println("\f");
            }
        }
    }

    /**
     * Method for sorting array alphabetically by words and their numbers
     * @param words array of words 
     * @param numbers array of numbers
     * @return void
     */
    public static void sortstrings(String[] words, int[] numbers) {
        String insertWord = "";
        int insertNum = 0;
        for(int index=1;index<words.length;index++) {
            insertWord = words[index];
            insertNum = numbers[index];
            for(int a=index-1;a>-1;a--) {
                if(insertWord.compareToIgnoreCase(words[a])<0) {
                    words[a+1]=words[a];
                    numbers[a+1]=numbers[a];
                } else {
                    words[a+1]=insertWord;
                    numbers[a+1]=insertNum;
                    break;
                }
                if(a==0) {
                    words[0]=insertWord;
                    numbers[0]=insertNum;
                    break;
                }
            }
        }
    }

    /**
     * Method for sorting array in numerical order with selection sort
     * @param words array of words
     * @param numbers array of numbers 
     * @return void
     */
    public static void numberSort(String[] words, int[] numbers) {
        int swapIndex = 0;
        int min = 0;
        String correspondingWord = "";
        for(int index=0;index<numbers.length;index++) {
            min = 1000000000;
            for(int a=index;a<numbers.length;a++) {
                if(numbers[a]<min) {
                    min=numbers[a];
                    correspondingWord = words[a];
                    swapIndex = a;
                }
            }
            numbers[swapIndex] = numbers[index];
            words[swapIndex] = words[index];
            numbers[index] = min;
            words[index] = correspondingWord;
        }
    }

    /**
     * Method for printing out words and numbers once succesfully sorted
     * @param none
     * @return void
     */
    public static void printArrays(String[] words, int[] numbers) {
        System.out.println("\f");
        for(int index=0;index<numbers.length;index++) {
            System.out.println(words[index] + " " + numbers[index]);
        }
    }

}
