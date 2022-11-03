import java.util.Scanner;
public class Q8
{
        public static void main(String[] args) {
            int n,y;
            Scanner a=new Scanner(System.in);
            System.out.println("Entr any number ");
            n=a.nextInt();
            for (int i=1 ;i<n; i++)
            {
                y=0;
                for (int j=2 ;j<i ; j++)
                {
                    if (i%j==0)
                        y=1;
                }
                if (y==0)
                    System.out.println(i);
            }
        }


}
