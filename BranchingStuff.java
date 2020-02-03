import java.util.Scanner;
public class BranchingStuff
{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
        
    System.out.println("Type an integer!");
    int answer = scan.nextInt();
        
    if (answer < 10) {
     System.out.println("You typed a number less than 10");
    } else if (answer > 13) {
     System.out.println(" You typed a number greater than 13");
    } else if (answer==5){
     System.out.println("You typed 5");
    } else{
     System.out.println("other");
      }
  }
}

