//Super class

public abstract class Container
{
    //variables
    protected double length;
    private double density;
    private String code;
    
    protected Container()
    {
    }
    
    protected Container(double length, double density, String code)
    {
        this.length = length;
        this.code = code;
        this.density = density;
    }
    
    //mutator
    public void setLength(double length)
    {
        this.length = length;
    }
    
    //accessor
    public double getLength()
    {
        return length;
    }
    
    public double getDensity()
    {
        return density;
    }
    
    public void setDensity(double density)
    {
        this.density = density;
    }
    
    public String getCode()
    {
        return code;
    }
    
    public void setCode(String code)
    {
        this.code = code;
    }
    
    public double getMass()
    {
        return Math.round(density * getCapacity() * 100.0) / 100.0;
    }
    
    //abstract method
    public abstract double getCapacity();
    
    //toString method
    @Override
    public String toString()
    {
        return "Code: " + code + ", Container Capacity: " + getCapacity() 
            + " m\u00B3" + ", \n\tCargo Density: " + getDensity() + " kg/m\u00B3, Cargo Weight: "  + getMass() + " kg";
    }
}
