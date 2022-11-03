import java.util.Scanner;
public class Q5
{
        // private static java.lang.Object System;

        public static void main(String[] args) {
            Scanner in = new Scanner (System.in);
            System.out.println(" Enter any text ");
            String ahm= in.next();
            int count =0;
            for (int i=1; i<ahm.length();i++){
                char M =ahm.charAt(i);
                if (M=='a'||M=='e'||M=='i'||M=='o'||M=='u'||M=='y');{
                    count++;
                }
            }
            System.out.println("number of vowels " +count);

        }
}
