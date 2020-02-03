/**
 * Nesting refers to the idea of putting something
 * inside of itself, like those Russian Dolls.
 * In Java, this can happen with if statements and
 * loops.
 */
import java.util.Scanner;
public class Nesting
{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are standing in front of a house.");
        System.out.println("1. Go in");
        System.out.println("2. Walk away");
        int response = scan.nextInt();
        if (response == 1) {
            System.out.println("A spooky ghost attacks");
            System.out.println("1. Scream");
            System.out.println("2. Eat Ice Cream");
            int ghost = scan.nextInt();
            if (ghost == 1) {
                System.out.println("The ghost eats your brain");
            }
            if (ghost == 2) {
                System.out.println("You share ice cream with the ghost and you are buds");
            }
        }
        if (response == 2) {
            System.out.println("You run away");
        }
      
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                System.out.println("X: " + x + " , Y: " + y);
            }
        }
    }
}