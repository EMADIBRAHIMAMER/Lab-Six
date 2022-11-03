import java.util.Scanner;
public class Q2c
{
        public static void main(String[] args) {
            System.out.print(" Enter number  ");
            Scanner in = new Scanner(System.in);

            int sum = 0;
            int utensil = 0;
            int number = in.nextInt();

            for (; ; ) {

                utensil = number % 10;
                sum += (utensil % 2 == 1) ? utensil : 0;
                number /= 10;

                if (number == 0) {
                    break;
                }
            }

            System.out.println("The sum of all odd digits is = " + sum);
        }



}
