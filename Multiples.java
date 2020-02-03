import java.util.Scanner;
public class Multiples
{
    public static void main(String[] Args){
        System.out.println("This program lets you type two numbers, then prints multiples of the 1st number, up to the limit of the 2nd number.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the first integer:");
        int first =scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Type the second integer:");
        int second =scan2.nextInt();
        int mult=1;
        int proxy = first;
        while (proxy<=second){
        System.out.println(first*mult);
        mult++;
        proxy=first*mult;
    }
    System.out.println("Goodbye!");
  }
}
