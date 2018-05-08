package oopExamples2;

public class Rectangle 
{
  private float length ;
  private float width  ;
  public Rectangle()
  {
	length = 5.0f;
	width =  6.0f;
  }
  public Rectangle(float length, float width)
  {
	  this.length = length;
	  this.width = width;
  }
  public float getLength()
  {
	  return length;
  }
  public float getWidth()
  {
	  return width;
  }
  public void setWidth(float width)
  {
	  this.width =width;
  }
  public double getArea()
  {
	  return length*width;
  }
  public double getPerimeter()
  {
	  return (2*(length+width));
  }
  public String toString()
  {
	  return "The rectangle has length and width of "+length+","+width+" so its perimeter is "+2*(length+width)+"and its area is "+length*width;
  }
}
