package Do_Lam;
public class Circle {
double radius;
String color;
public void Circle(double r, String x)
{
	this.radius=r;
	this.color=x;
}
public double getRadius()
{
	return radius;
}
public String getColor ()
{
	return color;
}
public double getArea()
{
	return radius*radius*Math.PI;
}
}
