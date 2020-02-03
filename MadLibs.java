/**
 * MadLibs
 * A fun game that creates a story with words inputted by the user
 * @author Arjan Kahlon
 */

import java.util.Scanner;
public class MadLibs {
    public static void main (String [] args){
       Scanner scannoun1;
       scannoun1 = new Scanner(System.in);
       System.out.println("Enter a name:");
       String Noun1 = scannoun1.next();

       Scanner scannoun2;
       scannoun2 = new Scanner(System.in);
       System.out.println("Enter another name:");
       String Noun2 = scannoun2.next();

       Scanner scannoun3;
       scannoun3 = new Scanner(System.in);
       System.out.println("Enter an object:");
       String Noun3 = scannoun3.next();



       Scanner scanadj1;
       scanadj1 = new Scanner(System.in);
       System.out.println("Enter an adjective:");
       String Adj1 = scanadj1.next();

       Scanner scanadj2;
       scanadj2 = new Scanner(System.in);
       System.out.println("Enter another adjective:");
       String Adj2 = scanadj2.next();

       Scanner scanadj3;
       scanadj3 = new Scanner(System.in);
       System.out.println("Enter another adjective:");
       String Adj3 = scanadj3.next();

       Scanner scanadj4;
       scanadj4 = new Scanner(System.in);
       System.out.println("Enter another adjective:");
       String Adj4 = scanadj4.next();    



       Scanner scanverb1;
       scanverb1 = new Scanner(System.in);
       System.out.println("Enter a verb:");
       String Verb1 = scanverb1.next();

       Scanner scanverb2;
       scanverb2 = new Scanner(System.in);
       System.out.println("Enter another verb:");
       String Verb2 = scanverb2.next();

       Scanner scanverb3;
       scanverb3 = new Scanner(System.in);
       System.out.println("Enter another verb:");
       String Verb3 = scanverb3.next();


       Scanner scanverb4;
       scanverb4 = new Scanner(System.in);
       System.out.println("Enter another verb:");
       String Verb4 = scanverb4.next();

       System.out.println("");
       System.out.println("Generating a totally new, never seen before, definitely not reused story, carefully customized for your entries...");
       try {
        Thread.sleep(2000);
       } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
         }

       System.out.println("");
       System.out.println("**************************************************************************************************************************");
       System.out.println("");

       try {
        Thread.sleep(2000);
       } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
         }

       System.out.println("You and your friends " + Noun1+" and "+Noun2+ " decide to go to cross country practice today. As you walk towards the");
       try {
        Thread.sleep(1000);
       } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
         }

       System.out.println("track, you are feeling "+Adj1+ ". Then you realize that practice doesn't start for another 30 minutes, and you go back to");
       try {
        Thread.sleep(1000);
       } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
         }

       System.out.println("feeling "+Adj2+". You pass the time by " +Verb1+"ing and "+ Verb2+"ing with your friends. When warmup finally starts, you");
       try {
        Thread.sleep(1000);
       } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
         }

       System.out.println("feel " +Adj3+" after the first lap, and "+ Adj4+" after the 4th and final lap. You "+ Verb3+ " over to your backpack and");
       try {
        Thread.sleep(1000);
       } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
         }

       System.out.println("reach for your "+ Noun3+" when you realize you left it in your locker and will need to quickly "+Verb4+" back to your");
       try {
        Thread.sleep(1000);
       } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
         }

       System.out.println("locker before practice starts! THE END");

    }
}

