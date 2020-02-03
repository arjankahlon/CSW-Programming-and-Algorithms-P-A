public class Question
{
    public static void main(String[] args) {
        int q = 3;
        int[] w = {3, 4, 5};
        boink(q, w);
        System.out.println(q);
        System.out.println(w[0]);
    }
    
    public static void boink(int x, int[] y) {
       x++;
       y[0]++;
    }
}