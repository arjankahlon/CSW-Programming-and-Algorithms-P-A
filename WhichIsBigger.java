import java.util.Scanner;
public class WhichIsBigger
{
     public static void main(String[] Args){
      Scanner A = new Scanner(System.in);
        
      System.out.println("Type the first integer!");
      int a =A.nextInt();
      
      Scanner B = new Scanner(System.in);
        
      System.out.println("Type the second integer!");
      int b = B.nextInt();
      
      if (a==b){
        System.out.print("The two numbers are equal!");
      }else if (a>b){
        System.out.println("The first number is greater than the second!");
      }else if (b>a){
        System.out.println("The second number is greater than the first!");
      }else{
        System.out.print("Congratulations, you've broken this program!");
      }
    }
}


