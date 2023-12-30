//39399575 Pienaar

import java.util.Random;

public class TestMyArrayList
{
    public static void main(String[] args)
    {
        int size = 16;
        
        //declare list that will hold all 16 values
        MyArrayList<Card> listFull = new MyArrayList<>();
        
        //declare 4 row lists
        MyArrayList<Card> row1 = new MyArrayList<>();
        MyArrayList<Card> row2 = new MyArrayList<>();
        MyArrayList<Card> row3 = new MyArrayList<>();
        MyArrayList<Card> row4 = new MyArrayList<>();
        
        Random rand = new Random();
        
        //populate big list with 8 pairs of random values
        for (int i = 1; i <= size; i++)
        {
            //generate random number from 1 - 8
            int rnd = rand.nextInt(size/2) + 1;
            
            //check if list is empty
            if (listFull.getSize() == 0)
            {
                //add item if list is empty
                listFull.add(i-1, new Card(rnd, false));
            }
            else //if list is not empty
            {
                //check for duplicates
                if (listFull.getCount(new Card(rnd, false)) < 2)
                {
                    //if not duplicate value, add item to list
                    listFull.add(i-1, new Card(rnd, false));
                }
                else
                {
                    //if more than 1 duplicate, reject item
                    //redo this loop iteration to generate new item
                    i--;
                }
            }
        }
        
        //for testing purposes
        //System.out.println(listFull);
        
        //populate 4 rows with full list's items
        for (int i = 0; i < size/4; i++)
        {
            row1.add(i, listFull.get(i));
            row2.add(i, listFull.get(i+4));
            row3.add(i, listFull.get(i+8));
            row4.add(i, listFull.get(i+12));
        }
        
        //display all 4 rows
        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);
    }
}
