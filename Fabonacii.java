import java.util.Scanner;
public class fabonacii
{
    public static void main(String ab[])
    {
        Scanner sc = new Scanner(System.in);
        int range;
        System.out.print("Enter the range till you find  fibonacci series --> ");
        range = sc.nextInt();
        int next = 1;
        int pre=0,series=0;
        System.out.println("======Fabonacci series till "+range+"=======");
        System.out.print(pre+" "+next+" ");
        for(int i = 0; i <= range; i++)
        {

            series = next+pre;
            pre = next;
            next = series;
            System.out.print(series+" ");

        }
    }
}
