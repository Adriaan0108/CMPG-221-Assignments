//sub class 1 

public class Intermodal extends Container
{
    private double width, height;
    
    public Intermodal()
    {
    }
    
    public Intermodal(String code, double width, double length, double height, double density)
    {
        super(length, density, code);
        this.width = width;
        this.height = height;
    }
    
    public void setWidth(double width)
    {
        this.width = width;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    //abstract method override
    public double getCapacity()
    {
        return Math.round(width * length * height * 100.0) / 100.0;
    }
    
    @Override
    public String toString()
    {
        return "[Intermodal] " + super.toString();
    }
}
