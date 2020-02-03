import java.util.Scanner;
public class MethodStuff
{
    public static int getInt(String message) {
        System.out.println(message);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static void main(String [] args) {
        int num = getInt("Give an Integer");
        int num2 = getInt("Give another Integer");
        System.out.println(num + num2);
        
        printThings(num, num2);
    }
    
    
    public static void printThings(int num1, int num2) {
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
    }
}