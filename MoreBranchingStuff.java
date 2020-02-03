import java.util.Scanner;
public class MoreBranchingStuff
{
    public static void main (String[] Args){
      Scanner scan = new Scanner(System.in);
        
      System.out.println("Type an integer!");
      int answer = scan.nextInt();
      
      if (answer<+5 && answer>0){
          System.out.println("1 to 5");
      }
      if (answer <20 || answer >30){
          System.out.println("less than 20 or greater than 30");
      }
      if (!(answer<10)){
          System.out.println("answer not less than 10");
        }
    }
}
