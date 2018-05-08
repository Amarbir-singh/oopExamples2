package oopExamples2;

public class Account1
{
    private String id;
    private String name;
    private int balance = 0;
	
    public Account1(String id, String name)
    {
	    this.id = id;
	    this.name = name;
     }
     public Account1(String id,String name, int balance)
     {
	    this.id = id;
	    this.name = name;
	    this.balance =  balance;
      }
     public String getID()
     {
    	 return id;
     }
     public String getName()
     {
    	 return name;
     }
     public int getBalance()
     {
    	 return balance;
     }
     public int credit(int amount)
     {
    	 balance+=amount;
    	 return balance;
     }
     public int debit(int amount)
     {
    	 if(amount<=balance)
    		 balance-=amount;
    	 else
    		 System.out.print("Amount exceeded balance");
    	 
    	 return balance;
     }
     public int transferTo(Account1 another, int amount)
     {
    	 if(amount<=balance)
    	    balance = amount;
    	 else
    		 System.out.println("Amount exceeded balance");
    	 
    	 return balance;
     }
     public String toString()
     {
    	 return "Account [ "+id+ ","+ name+","+balance+"]";
     }
 
}