package oopExamples2;

public class InvoiceItem 
{
  private String id;
  private String desc;
  private int qty;
  private double unitPrice;
  public InvoiceItem()
  {
	id ="singh";
	desc ="hello";
	qty = 5;
	unitPrice =5.5;
  }
  public InvoiceItem(String id,String desc, int qty, double unitPrice)
  {
	  this.id = id;
	  this.desc = desc;
	  this.qty = qty;
	  this.unitPrice = unitPrice;
  }
  
  public String getId()
  {
	  return id;
  }
  public int getQty()
  {
	  return qty;
  }
  public void setQty(int newQty)
  {
	  qty = newQty;
  }
  public double getUnitPrice()
  {
	  return unitPrice;
  }
  public void setUnitPrice(double unitPrice)
  {
	  this.unitPrice = unitPrice;
  }
  public double getTotal()
  {
	  return unitPrice*qty;
  }
  public String toString()
  {
	  return "InvoiceItem [id = "+id+" \ndesc = "+desc+"\nqty = "+ qty+"\n unitPrice = "+unitPrice;
  }
  
  
}
