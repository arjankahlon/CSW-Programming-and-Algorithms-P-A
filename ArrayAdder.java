import java.util.Scanner;
public class ArrayAdder{
   public static void main(String [] args) {
        System.out.println("How many integers would you like to enter?");
        Scanner scan1 = new Scanner(System.in);
        int number= scan1.nextInt();
        
        int[] addArray = new int [number];
        
        int total=0;
        
        for(int i = 0; i < addArray.length; i++) {
           System.out.println("Enter the next integer you'd like to add:");
           Scanner scan2 = new Scanner(System.in);
           int a= scan2.nextInt();
           addArray[i] = a;
           total=total+addArray[i];
        }
        
        System.out.println("The total of your integers is: "+total);
   }
}
