//39399575 Pienaar

import java.util.Random;

public class TestMyArrayList
{
    public static void main(String[] args)
    {   
        //declare 4 row lists
        MyArrayList<Card> row1 = new MyArrayList<>();
        MyArrayList<Card> row2 = new MyArrayList<>();
        MyArrayList<Card> row3 = new MyArrayList<>();
        MyArrayList<Card> row4 = new MyArrayList<>();
        
        Random rand = new Random();
        int index = 0;
        
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
        
        //display all 4 rows
        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);
    }
}
