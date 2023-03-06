import java.util.Scanner;
public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str="";
        System.out.print("Enter a string --> ");
        str= scanner.nextLine();
        System.out.println();//one line gap
        System.out.println("Actual String is => "+str);
        System.out.println("--------------------------------");
        System.out.print("Reverse String is => ");
        for(int i = (str.length()-1); i >= 0; i--)
        {
            System.out.print(str.charAt(i));
        }


    }
}
