
/**
 * Write a description of class Flight here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Flight
{
    private int id, count;
    private MyLinkedList<Passenger> list = new MyLinkedList<Passenger>();
    
    public Flight()
    {
    }
    
    public Flight(int id)
    {
        this.id = id;
    }
    
    public int getPassengerCount()
    {
        return count;
    }
    
    public int getFlightNum()
    {
        return id;
    }
    
    public void setFlightNum()
    {
        this.id = id;
    }
    
    public boolean reserveTicket(String pID, String pName, String pCell)
    {
        Passenger pass = new Passenger(pID, pName, pCell);
        if (checkTicket(pID, pName, pCell))
        {
            return false;
        }
        else
        {
            list.append(pass);
            count++;
            return true;
        }
    }
    
    public boolean cancelTicket(String pID, String pName, String pCell)
    {
        Passenger pass = new Passenger(pID, pName, pCell);
        if (checkTicket(pID, pName, pCell))
        {
            list.delete(pass);
            count--;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean checkTicket(String pID, String pName, String pCell)
    {
        Passenger pass = new Passenger(pID, pName, pCell);
        if (list.contains(pass))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String displayPassengers()
    {
        return list.toString();
    }
    
    public boolean equals(Flight flight)
    {
        int fID = flight.getFlightNum();
        int tID = this.id;
        
        if (fID == tID)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    @Override
    public String toString()
    {
        return "Flight ID: " + id;
    }
}
