package testexample;

public class cuboid implements Shape3d 
{
	private double length = 0x0;
	private double width = 0;
	private double height;
	s_shape type = s_shape.CUBOID;
	
	cuboid(double l, double w, double h)
	{
		setUnit(s_unit.HEIGHT, h);
		setUnit(s_unit.WIDTH, w);
		setUnit(s_unit.LENGTH, l);
		
	}
	
	@Override
	public double getUnit(s_unit unit)
	{
		
		switch(unit)
		{
			case LENGTH:	return length;
			case WIDTH:		return width; 
			case HEIGHT:	return height;
			default:		System.out.println("You will never see this!");
							return -1;
		}
	}//getUnit
	@Override
	public void setUnit(s_unit unit, double value)
	{

		switch(unit)
		{
			case LENGTH:	length = value;
							break;
			case WIDTH:		width = value;
							break;
			case HEIGHT:	height = value;
							break;
			default:		System.out.println("You will never see this!");
		}//switch
		
		
	}//setUnit
	@Override
	public double getVolume() 
	{	
		return length * width * height;
	}
	@Override
	public s_shape getType() 
	{
		return type;
	}
	@Override
	public double getArea() 
	{
		return 2*(length*width + length*height + height*width);
	}

	@Override
	public void printInformation() 
	{
		System.out.println(getType());
		System.out.println("Length: " + getUnit(s_unit.LENGTH));
		System.out.println("Width: " + getUnit(s_unit.WIDTH));
		System.out.println("Height: " + getUnit(s_unit.HEIGHT));
		System.out.println("Volume: " + getVolume());
		System.out.println("Area: " + getArea());
		
	}

}
