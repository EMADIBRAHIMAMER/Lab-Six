import java.util.Scanner;
public class Q3
{
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.print("Enter your Name ");
            String Name = in.next();

            for(int i=0; i < Name.length(); i++){
                System.out.println(Name.charAt(i));
            }
        }


}
