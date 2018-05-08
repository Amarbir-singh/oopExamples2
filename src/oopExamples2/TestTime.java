package oopExamples2;

public class TestTime 
{
   public static void main(String[] args)
   {
	   TimeClass t1 = new TimeClass(5,45,59);
	   System.out.println(t1.getHour());
	   System.out.println(t1.getMinute());
	   System.out.println(t1.getSecond());
	   System.out.println(t1.toString());
	   System.out.println(t1.nextSecond());
	   System.out.println(t1.previousSecond());
	   
	   
	   
   }
}
