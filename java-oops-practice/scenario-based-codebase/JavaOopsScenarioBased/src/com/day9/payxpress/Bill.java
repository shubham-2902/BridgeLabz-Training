package com.day9.payxpress;
public abstract class  Bill implements IPayable {
	  protected String type;
	  protected double amount;
	  protected String dueDate;
	  
	  
	  
	  private boolean isPaid;
	  private String paymentDetails;
	  public Bill (String type, double amount, String dueDate)
	  {
		  this.type = type;
		  this.amount = amount;
		  this.dueDate= dueDate;
		  this.isPaid= false;  
	  }
	  public Bill (String type, double amount, String dueDate, boolean recurring)
	  {
		this(type,amount,dueDate);
		if(recurring)
		{
			System.out.println("Recurring bill created for :"+type);
		}
	  }
	  public boolean isPaid()
	  {
		  return isPaid;
	  }
	  protected void markPaid(String details)
	  {
		  isPaid = true;
		  paymentDetails= details;
	  }
	  protected double calculateLateFee(int daysLate) {
		  double penalty = daysLate*10;
		  return amount+ penalty;
		  
	  }
	  public void showBillInfo() {
		  System.out.println("....Bill Info ......");
		  System.out.println("Bill Type "+type);
		  System.out.println("Amount "+ amount);
		  System.out.println("Due Date "+ dueDate);
		  System.out.println("Paid Status "+ isPaid);
		  
	  }
	  
}


