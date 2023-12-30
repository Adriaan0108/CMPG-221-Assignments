import java.util.Scanner;

public class testContainer
{
    public static void main(String[] args)
    {
        int numItems = 5;
        
        //Array of superclass
        Container containers[] = new Container[numItems];
        //Add data
        containers[0] = new Intermodal("A23", 4, 8, 4, 700);
        containers[1] = new Tanker("C67", 2, 10, 70);
        containers[2] = new Tanker("K98", 3, 6, 910);
        containers[3] = new Intermodal("F35", 5, 8, 4, 80);
        containers[4] = new Tanker("R75", 2.5, 6, 1000);
        
        for (int i = 0; i < numItems; i++)
        {
            //toString implicit
            System.out.println("\ncontainers[" + i + "]: " + containers[i]);
        }
        
        Scanner in = new Scanner(System.in);
        System.out.println("\nFind Container by Code:");
        String find = in.nextLine();
        
        int i = 0;
        boolean isFound = false;
        while (i < numItems && !isFound)
        {
            if (containers[i].getCode().equals(find))
            {
                isFound = true;
                System.out.println("\nDetails for " + find + ":");
                //toString explicit
                System.out.println(containers[i].toString());
            }
            i++;
        }
        
        if (!isFound)
        {
            System.out.println(find + " was not found.");
        }
    }
}
