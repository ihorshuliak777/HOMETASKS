/**
 * Created by Игорь on 15.01.2016.
 */
public class Task1 {
    public static void main(String []args){
        byte x = 1;
        System.out.println ((short) x);
        {
            short y = 2;
            System.out.println ((int) y);
        }
        {
            char a = 55;
            System.out.println ((int) a );
        }
        {
            int b = 43;
            System.out.println ((long) b);
            System.out.println ((float)b);
            System.out.println ((double)b);
        }
        long c = 32;
        System.out.println ((float)c);
        System.out.println ((double)c);
    }
}
