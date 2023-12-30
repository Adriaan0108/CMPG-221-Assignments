//39399575 Pienaar

public class Card
{
    private int value;
    private boolean guessed;

    public Card()
    {
        
    }
    
    public Card(int value)
    {
        this.value = value;   
        this.guessed = false;
    }

    public void setValue(int value)
    {
        this.value = value;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public void setGuessed(boolean guessed)
    {
        this.guessed = guessed;
    }
    
    public boolean isGuessed()
    {
        return guessed;
    }
    
    public boolean equals(Object e)
    {
        //compare object to itself
        if (e == this)
        {
            return true;
        }
        
        //if object is of type Card
        if (e instanceof Card)
        {
            //cast object to type Card
            Card c = (Card)e;
            
            //if values match return true
            if (Integer.compare(value, c.value) == 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    
    @Override
    public String toString()
    {
        if (this.guessed)
        {
            return "" + value + "";
        }
        else
        {
            return "";
        }
    }
}
