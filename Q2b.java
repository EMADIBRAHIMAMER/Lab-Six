import java.util.Scanner;

public class Q2b
{
        public static void main(String[] args) {

            Scanner in = new Scanner (System.in);
            int sum;

            System.out.println("Enter any numbers from A to B ");
            System.out.println(" Enter A ");
            int a = in.nextInt();
            System.out.print(" Enter B ");
            int b = in.nextInt();
            int min = (a > b || a == b)? b : a ;
            int max = (a > b || a == b)? a : b ;

            sum = 0;
            for (int i = min; i <= max; i+=2) { sum += i ; }

            System.out.println("The sum = " + sum);


        }

}
