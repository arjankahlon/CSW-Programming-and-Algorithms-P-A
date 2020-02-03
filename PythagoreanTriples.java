import java.util.Scanner;
public class PythagoreanTriples{
   public static boolean isPythag(int a,int b, int c) {
     if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)){
       return true;
     }else{
       return false;
     }
   }
    public static void main(String [] args) {
        System.out.println("Type the first integer:");
        Scanner scan1 = new Scanner(System.in);
        int a= scan1.nextInt();
        
        System.out.println("Type the second integer:");
        Scanner scan2 = new Scanner(System.in);
        int b= scan2.nextInt();
        
        System.out.println("Type the third integer:");
        Scanner scan3 = new Scanner(System.in);
        int c= scan3.nextInt();

        System.out.println(isPythag(a,b,c));
   }
}
