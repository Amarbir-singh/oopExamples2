package oopExamples2;

public class TestInvoicement 
{
	public static void main(String[] args)
	{
       InvoiceItem i1 = new InvoiceItem();
       System.out.println(i1.getId());
       System.out.println(i1.getQty());
       System.out.println(i1.getUnitPrice());
       System.out.println(i1.getTotal());
       System.out.println(i1.toString());
	}
}
