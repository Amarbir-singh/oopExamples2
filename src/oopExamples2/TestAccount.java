package oopExamples2;

public class TestAccount 
{
    public static void main(String[] args)
    {
    	Account1 a1 = new Account1("55","gill",5500);
    	System.out.println(a1.getID());
    	System.out.println(a1.getName());
    	System.out.println(a1.getBalance());
    	System.out.println(a1.credit(5000));
    	System.out.println(a1.debit(6000));
  
    	System.out.println(a1.toString());
    	
    }
}
