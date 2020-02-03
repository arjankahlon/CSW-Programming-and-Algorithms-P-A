import java.util.Scanner;
public class BinaryFinder{
    static int n=0;
    public static void main(String[] Args){
        System.out.println("Enter an integer to print the binary number for that integer:");
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        BinaryPrint(n);
    }
    public static void BinaryPrint(int n){
        if(n>0){
            BinaryPrint(n/2);
            System.out.print(n%2);   
        }
    }
}
