package OOP;

public class Circle {
  double radius ;
  Circle()
  {
	  
  }
  Circle(double r)
  {
	  radius = r ;
  }
  public double getArea()
  {
	  return Math.PI*2*radius;
  }
  public double getPerimeter()
  {
	  return Math.PI*radius*radius ;
  }
  public boolean check(Circle c)
  {
	  if(radius == c.radius)
		  return true ;
	  return false ;
  }
}
