//39399575 Pienaar

import java.util.Random;
import java.util.Scanner;

public class TestMyArrayList
{
    //for testing purposes
    //private static boolean alreadyChosen1 = true;
    
    public static void main(String[] args)
    {   
        //declare 4 row lists
        MyArrayList<Card> row1 = new MyArrayList<>();
        MyArrayList<Card> row2 = new MyArrayList<>();
        MyArrayList<Card> row3 = new MyArrayList<>();
        MyArrayList<Card> row4 = new MyArrayList<>();
        
        Random rand = new Random();
        int index = 0;
        
        //populate all 4 rows with random values
        for (int k = 0; k < 16; k++)
        {
            int rnd = rand.nextInt(8) + 1;
            Card c = new Card(rnd);
            
            int count = 0;
            count = row1.getCount(c) + row2.getCount(c) 
                + row3.getCount(c) + row4.getCount(c);

            if (count < 2)
            {
                if (!row1.isFull())
                {
                    row1.add(index, c);
                }
                else if (!row2.isFull())
                {
                    row2.add(index, c);
                }
                else if (!row3.isFull())
                {
                    row3.add(index, c);
                }
                else if (!row4.isFull())
                {
                    row4.add(index, c);
                }
            }
            else
            {
                k--;
            }
        }
        
        showAll(row1, row2, row3, row4);
        
        Card c1 = new Card();
        Card c2 = new Card();
        Scanner in = new Scanner(System.in);
        while (!checkWin(row1, row2, row3, row4))
        {
            System.out.println("Enter first value row number:");
            int firstRow = in.nextInt();
            
            while (firstRow < 0 || firstRow > 3)
            {
                System.out.println("Row number can only be from 0 to 3.");
                System.out.println("Enter first value row number:");
                firstRow = in.nextInt();
            }
            
            System.out.println("Enter first value column number:");
            int firstCol = in.nextInt();
            boolean alreadyChosen1 = true;
            while ((firstCol < 0 || firstCol > 3) || alreadyChosen1)
            {
                //check if value is out of bounds
                while (firstCol < 0 || firstCol > 3)
                {
                    System.out.println("Column number can only be from 0 to 3.");
                    System.out.println("Enter first value column number:");
                    firstCol = in.nextInt();
                }
                //check if player is trying to guess an already guessed card
                if(firstRow == 0)
                {
                    c1 = (Card)row1.get(firstCol);
                    if (!c1.isGuessed())
                    {
                        c1.setGuessed(true);
                        alreadyChosen1 = false;
                    }
                    else
                    {
                        System.out.println("The card in this column is already guessed. Please guess another...");
                        System.out.println("Enter first value column number:");
                        firstCol = in.nextInt();
                    }
                }
                else if(firstRow == 1)
                {
                    c1 = (Card)row2.get(firstCol);
                    if (!c1.isGuessed())
                    {
                        c1.setGuessed(true);
                        alreadyChosen1 = false;
                    }
                    else
                    {
                        System.out.println("The card in this column is already guessed. Please guess another...");
                        System.out.println("Enter first value column number:");
                        firstCol = in.nextInt();
                    }
                }
                else if(firstRow == 2)
                {
                    c1 = (Card)row3.get(firstCol);
                    if (!c1.isGuessed())
                    {
                        c1.setGuessed(true);
                        alreadyChosen1 = false;
                    }
                    else
                    {
                        System.out.println("The card in this column is already guessed. Please guess another...");
                        System.out.println("Enter first value column number:");
                        firstCol = in.nextInt();
                    }
                }
                else if(firstRow == 3)
                {
                    c1 = (Card)row4.get(firstCol);
                    if (!c1.isGuessed())
                    {
                        c1.setGuessed(true);
                        alreadyChosen1 = false;
                    }
                    else
                    {
                        System.out.println("The card in this column is already guessed. Please guess another...");
                        System.out.println("Enter first value column number:");
                        firstCol = in.nextInt();
                    }
                }
            }
            
            showAll(row1, row2, row3, row4);
            
            System.out.println("Enter second value row number:");
            int secondRow = in.nextInt();
            while (secondRow < 0 || secondRow > 3)
            {
                System.out.println("Row number can only be from 0 to 3");
                System.out.println("Enter second value row number:");
                secondRow = in.nextInt();
            }
            
            System.out.println("Enter second value column number:");
            int secondCol = in.nextInt();
            boolean alreadyChosen2 = true;
            while ((secondCol < 0 || secondCol > 3) || alreadyChosen2)
            {
                while (secondCol < 0 || secondCol > 3)
                {
                    System.out.println("Column number can only be from 0 to 3");
                    System.out.println("Enter second value column number:");
                    secondCol = in.nextInt();
                }
                
                if(secondRow == 0)
                {
                    c2 = (Card)row1.get(secondCol);
                    if(!c2.isGuessed())
                    {
                        c2.setGuessed(true);
                        alreadyChosen2 = false;
                    }
                    else
                    {
                        System.out.println("The card in this column is already guessed. Please guess another...");
                        System.out.println("Enter second value column number:");
                        secondCol = in.nextInt();
                    }
                }
                else if(secondRow == 1)
                {
                    c2 = (Card)row2.get(secondCol);
                    if(!c2.isGuessed())
                    {
                        c2.setGuessed(true);
                        alreadyChosen2 = false;
                    }
                    else
                    {
                        System.out.println("The card in this column is already guessed. Please guess another...");
                        System.out.println("Enter second value column number:");
                        secondCol = in.nextInt();
                    }
                }
                else if(secondRow == 2)
                {
                    c2 = (Card)row3.get(secondCol);
                    if(!c2.isGuessed())
                    {
                        c2.setGuessed(true);
                        alreadyChosen2 = false;
                    }
                    else
                    {
                        System.out.println("The card in this column is already guessed. Please guess another...");
                        System.out.println("Enter second value column number:");
                        secondCol = in.nextInt();
                    }
                }
                else if(secondRow == 3)
                {
                    c2 = (Card)row4.get(secondCol);
                    if(!c2.isGuessed())
                    {
                        c2.setGuessed(true);
                        alreadyChosen2 = false;
                    }
                    else
                    {
                        System.out.println("The card in this column is already guessed. Please guess another...");
                        System.out.println("Enter second value column number:");
                        secondCol = in.nextInt();
                    }
                }
            }
            showAll(row1, row2, row3, row4);
            //check if two guessed cards match
            if (c1.equals(c2))
            {
                System.out.println("Good Guess!");
                c1.setGuessed(true);
                c2.setGuessed(true);
            }
            else
            {
                System.out.println("Oops!");
                c1.setGuessed(false);
                c2.setGuessed(false);
            }
        }
       
        System.out.println("You win!");
    }
    
    public static void showAll(MyArrayList<Card> row1, MyArrayList<Card> row2,
        MyArrayList<Card> row3, MyArrayList<Card> row4)
    {
        //display all 4 rows
        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);
    }
    
    public static boolean checkWin(MyArrayList<Card> row1, MyArrayList<Card> row2,
        MyArrayList<Card> row3, MyArrayList<Card> row4)
    {
        //if all the cards are guessed, the player wins
         if (row1.isAllGuessed() && row2.isAllGuessed() && 
             row3.isAllGuessed() && row4.isAllGuessed()) 
            {
                 return true;
            }
            else
            {
                return false;
            }
    }
}
