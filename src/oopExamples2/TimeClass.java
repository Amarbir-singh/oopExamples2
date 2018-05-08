package oopExamples2;

public class TimeClass
{
   private int hour;
   private int minute;
   private int second;
   public TimeClass(int hour, int minute, int second)
   {
	   this.hour = hour;
	   this.minute = minute;
	   this.second = second;
   }
   public int getHour()
   {
	   return hour;
   }
   public int getMinute()
   {
	   return minute;
   }
   public int getSecond()
   {
	   return second;
   }
   public void setHour(int newHour)
   {
	   hour = newHour;
   }
   public void setMinute(int newMinute)
   {
	   minute = newMinute;
   }
   public void setSecond(int newSecond)
   {
	   second = newSecond;
	   
   }
   public void setTime(int hour,int minute, int second)
   {
	   this.hour = hour;
	   this.minute = minute;
	   this.second = second;
   }
   public String toString()
   {
	   return hour+":"+minute+":"+second;
   }
   public int nextSecond()
   {
	   return second+1;
   }
   public int previousSecond()
   {
	   return second-1;
   }
   
}
