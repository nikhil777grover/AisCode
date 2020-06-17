import java.lang.Math;
class areacircle 
{
	public static void main(String args[])
	{
	/* float area;  show error due to Explicit Type Conversion
	double r=7; */

	double area;
	float r=7;
	area=3.14*(Math.pow(r,2));
	System.out.println("Area of circle radius "+r+"is "+area);
	}
}