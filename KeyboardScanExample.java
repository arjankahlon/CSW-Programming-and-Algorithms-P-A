import java.util.Scanner;

public class KeyboardScanExample
{
    public static void main(String [] args) {
        Scanner scan;
        scan = new Scanner(System.in);
        
        System.out.println("Please type something");
        String inputString = scan.next();  // scan.next() will wait for
            // keyboard input and then return then next token as a String
            // Try typing something then a space and then an integer
            // and you will see the quirk mentioned above
            
        System.out.println("You typed: " + inputString);
        
        System.out.println("Please type an integer");
        int inputInteger = scan.nextInt(); // scan.nextInt() will wait for
            // keyboard input and return the next token as an int
            // If you don't type an integer, the program will end with an
            // Input mismatch exception
            
        System.out.println("Your integer is: " + inputInteger);
        
        System.out.println("Please type a double");
        double inputDouble = scan.nextDouble(); //scan.nextDouble() will wait
            // for keyboard input and return then next token as a double
            
        System.out.println("Your double is: " + inputDouble);

    }
}