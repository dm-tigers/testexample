package testexample;

public class rect implements Shape2d
{
	private double width;
	private double height;
	s_shape type = s_shape.RECT;
	
	//Constructor
	rect()
	{
		setUnit(s_unit.WIDTH, 1);
		setUnit(s_unit.HEIGHT, 1);
	}//rect()
	
	rect(double w, double h)
	{
		setUnit(s_unit.WIDTH, w);
		setUnit(s_unit.HEIGHT, h);
	}//rect(double,double)
	
	
	//Unit Getter uses s_unit enums
	@Override
	public double getUnit(s_unit unit)
	{
		
		switch(unit)
		{
			case WIDTH: 	return width;

			case HEIGHT:	return height;

			default:		System.out.println("You should not see this.");
							return -1;
		}//switch
	}//getUnit
	

	// Unit Setter uses s_unit enums
	/*@Override*/
	public void setUnit(s_unit unit, double value)
	{		
		switch(unit)
		{
			case WIDTH:		width = value; 	
						break;
			case HEIGHT:	height = value;
						break;
			default: 		System.out.println("You should not see this.");
		}//switch
	}//setUnit

	//Returns area
	@Override
	public double getArea() 
	{
		return width * height;
	}

	//Returns enum type
	@Override
	public s_shape getType() 
	{
		return type;
		
	}
	//Prints information
	@Override
	public void printInformation()
	{
		System.out.println(getType());
		System.out.println("Width: " + getUnit(s_unit.WIDTH));
		System.out.println("Height: " + getUnit(s_unit.HEIGHT));
		System.out.println("Area: " + getArea());
		
	}

		
}
