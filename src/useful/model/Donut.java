package useful.model;

public class Donut
{
	private boolean hasSprinkles;		//Declares Donut's variables
	private boolean hasGlaze;
	private String shape;
	private String flavor;
	private int holeCount;
	
	public Donut()
	{
		this.flavor = "plain";
		this.shape = "round";
		this.holeCount = 1;
		this.hasSprinkles = false;
		this.hasGlaze = false;
	}
	
	public Donut(String flavor)
	{
		this();		//() calls this Donut's constructor
		this.flavor = flavor;
	}
	
	public String toString()
	{
		String description = "This donut is a " + flavor + " donut";
		
		return description;
	}

	public String getShape()
	{
		return shape;
	}
	
	public void setShape(String shape)
	{
		this.shape = shape;
	}
	
	public String getFlavor()
	{
		return flavor;
	}
}