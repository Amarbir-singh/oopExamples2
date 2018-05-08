package oopExamples2;

public class TestDate
{
   public static void main(String[] args)
   {
	   DateEx d1 =new DateEx(05,11,1993);
		System.out.println(d1.getDay());
		System.out.println(d1.getMonth());
		System.out.println(d1.getYear());
		d1.setDate(30,01,1993);
		System.out.println(d1.toString());
		
   }
}
