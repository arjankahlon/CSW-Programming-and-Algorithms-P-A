import java.util.Scanner;
public class GuessingGame{
    static int counter=0;
    static int min=0;
    static int max=0;
    public static void main(String [] args) {
        System.out.println("Type the min integer:");
        Scanner scanmin = new Scanner(System.in);
        min= scanmin.nextInt();
        System.out.println("Type the max integer:");
        Scanner scanmax = new Scanner(System.in);
        max= scanmax.nextInt();
        notmain();
    }

    public static void notmain(){
        int range=max-min;
        int halfrange=range/2;
        int[] array = new int[range+1];
        int value=min;
        int middle = halfrange+min;
        System.out.println("Possible numbers:");
        for(int i=0; i<=range; i++){
            array[i]= value;
            value++;
            System.out.println(array[i]);
        }
        System.out.println("Is "+middle+" your number? Type 0 for too big, 1 for correct, or 2 for too small:");
        Scanner scaninput = new Scanner(System.in);
        int input= scaninput.nextInt();
        if(input==0){
            max = middle-1;
            range=max-min;
            halfrange=range/2;
            middle = halfrange+min;
            counter++;
            notmain();
        }
        if(input==1){
            counter++;
            System.out.print("It took me "+counter+" tries to guess the number"+middle+".");
        }
        if(input==2){
            min = middle+1;
            range=max-min;
            halfrange=range/2;
            middle = halfrange+min;
            counter++;
            notmain();
        }
    }
}