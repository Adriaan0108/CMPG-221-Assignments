import java.util.Scanner;

public class Recursion
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("This program computes a * b....");
        System.out.println("Please enter a: ");
        int a = in.nextInt();
        System.out.println("Please enter b: ");
        int b = in.nextInt();
        System.out.println("");
        System.out.println(a + " * " + b + " = " + calc(a, b));
    }
    
    public static int calc(int a, int b)
    {
        //base case
        if (a == 0 || b == 0)
        {
            return 0;
        }
        else
        {
            //recursive call
            //run b amount of times and add a that same amount of times
            return a + calc(a, (b-1));
        }
    }
}