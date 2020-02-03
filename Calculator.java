import java.util.Scanner;
public class Calculator
{
    public static void main(String [] args) {
        Scanner operationscan = new Scanner(System.in);
        
        System.out.println("Type the symbol of the operation would you like to perform (+  -  *  / ):");
        String operation = operationscan.next();
        
        Scanner num1scan = new Scanner(System.in);
        
        System.out.println("Type the first double:");
        double num1 =num1scan.nextDouble();
      
        Scanner num2scan = new Scanner(System.in);
        
        System.out.println("Type the second double:");
        double num2 = num2scan.nextDouble();
        
        
      
        
        if (operation.equals("+")) {
           System.out.println(num1 + " + " +num2 +" = "+ (num1+num2));

        }
         else if (operation.equals("-")) {
           System.out.println(num1 + " - " +num2 +" = "+ (num1-num2));

        }
        else if (operation.equals("*")) {
           System.out.println(num1 + " * " +num2 +" = "+ (num1*num2));

        }
        else if (operation.equals("/")) {
           System.out.println(num1 + " / " +num2+" = "+ (num1/num2));

        }
        else {
            System.out.println("Error: Operation failed");
        }
    }
}
