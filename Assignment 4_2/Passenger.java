
/**
 * Write a description of class Passenger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Passenger
{
    private String id, name, cell;
    
    public Passenger()
    {
    }
    
    public Passenger(String id,String name,String cell)
    {
        this.id = id;
        this.name = name;
        this.cell = cell;
    }
    
    public void setID()
    {
        this.id = id;
    }
    
    public void setName()
    {
        this.name = name;
    }
    
    public void setCell()
    {
        this.cell = cell;
    }
    
    public String getID()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getCell()
    {
        return cell;
    }
    
    public boolean equals(Passenger pass)
    {
        String pID = pass.getID();
        String pName = pass.getName();
        String pCell = pass.getCell();
        
        String tID = this.id;
        String tName = this.name;
        String tCell = this.cell;
        
        
        if ((pID.equals(tID)) && (pName.equals(tName)) && (pCell.equals(tCell)))
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
       return "ID: " + id + ", Name: " + name + ", Contact nr: " + cell + "\n";
    }
}
