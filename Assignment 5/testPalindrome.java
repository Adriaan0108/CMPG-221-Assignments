import java.util.Scanner;

public class testPalindrome
{
    public static void main(String[] args)
    {
        MyLinkedList<String> list = new MyLinkedList<>();
        Scanner in = new Scanner(System.in);
        String word = "";
        String stop = "0";
        
        while (!word.equals(stop))
        {
            System.out.println("Enter a Word. Press 0 (zero) to Test for Palindrome");
            word = in.nextLine();
            
            if (!word.equals(stop))
            {
                list.append(word);
            }
        }
        
        System.out.println("Original list:");
        System.out.println(list.toString());
        list = list.isPalindrome();
        System.out.println("Palindrome list:");
        System.out.println(list.toString());
    }
}
