import java.util.Scanner;
public class biggerDoubleProgram{
       
   public static int biggerDouble(double p1,double p2) {
     if(p1>p2){
         return 1;
     }else if (p1==p2){
         return 0;
     }else if (p1<p2){
         return -1;
     }else{
         return 6969666;
     }
   }

    public static void main(String [] args) {
        System.out.println("Type the first parameter:");
        Scanner scan1 = new Scanner(System.in);
        double p1= scan1.nextDouble();
        
        System.out.println("Type the second parameter:");
        Scanner scan2 = new Scanner(System.in);
        double p2= scan2.nextDouble();

        System.out.println(biggerDouble(p1, p2));
   }
}
