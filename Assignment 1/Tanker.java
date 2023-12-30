//sub class 2

public class Tanker extends Container
{
    private double radius;
    
    public Tanker()
    {
    }
    
    public Tanker(String code, double radius, double length, double density)
    {
        super(length, density, code);
        this.radius = radius;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    //abstract method override
    public double getCapacity()
    {
        return Math.round(radius * radius * Math.PI * length * 100.0) / 100.0;
    }
    
    @Override
    public String toString()
    {
        return "[Tanker] "+ super.toString();
    }
}
