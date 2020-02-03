public class MonteCarlo {
    public static void main(String[] args){
        int r2= 0;
        int r3= 0;
        int r4= 0;
        int r5= 0;
        int r6= 0;
        int r7= 0;
        int r8= 0;
        int r9= 0;
        int r10= 0;
        int r11= 0;
        int r12= 0;
        for(int count=0; count<10000; count++){
            int dice1 = (int) (Math.random() * 6 + 1);
            int dice2 = (int) (Math.random() * 6 + 1);
            int result= dice1+dice2;
            if(result==2){
                r2++;
            }else if(result==3){
                r3++;
            }else if(result==4){
                r4++;
            }else if(result==5){
                r5++;
            }else if(result==6){
                r6++;
            }else if(result==7){
                r7++;
            }else if(result==8){
                r8++;
            }else if(result==9){
                r9++;
            }else if(result==10){
                r10++;
            }else if(result==11){
                r11++;
            }else if(result==12){
                r12++;
            }else{
                System.out.println ("An error occured on roll "+count);
            }
        }
        System.out.println("Done! 2 dice were rolled together 10,000 times, resulting in the following totals of both dice:");
        System.out.println("The total 2 was rolled "+ r2+" times");
        System.out.println("The total 3 was rolled "+ r3+" times");
        System.out.println("The total 4 was rolled "+ r4+" times");
        System.out.println("The total 5 was rolled "+ r5+" times");
        System.out.println("The total 6 was rolled "+ r6+" times");
        System.out.println("The total 7 was rolled "+ r7+" times");
        System.out.println("The total 8 was rolled "+ r8+" times");
        System.out.println("The total 9 was rolled "+ r9+" times");
        System.out.println("The total 10 was rolled "+ r10+" times");
        System.out.println("The total 11 was rolled "+ r11+" times");
        System.out.println("The total 12 was rolled "+ r12+" times");
    }
}