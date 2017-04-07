package testexample;

enum s_unit{
	WIDTH,
	LENGTH,
	HEIGHT,
	RADIUS
}

enum s_shape{
	RECT,
	CIRCLE,
	TRIANGLE,
	CUBOID, 
	CONE, 
	PARRALELOGRAM,
	SPHERE,
	CUBE,
	SHAPE
}

public interface ShapeBasic {
	 
	s_shape type = null;
	public s_shape getType();
	public void printInformation();

}
