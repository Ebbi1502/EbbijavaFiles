package bank;

import java.util.Scanner;

public class Customer {
	
private int customerid,customer_phonenum,customeraccount;
private String customername;

Account account;

Scanner scanner;

Customer(){
	scanner=new Scanner(System.in);
	account=null;
}
Customer(String customername,int customer_phonenum,int customeraccount,Account account){
	scanner=new Scanner(System.in);
	this.customername=customername;
	this.customer_phonenum=customer_phonenum;
	this.customeraccount=customeraccount;
	this.account=account;
}
Customer(int customerid,String customername,int customer_phonenum,int customeraccount,Account account){
	scanner=new Scanner(System.in);
	this.customerid=customerid;
	this.customername=customername;
	this.customer_phonenum=customer_phonenum;
	this.customeraccount=customeraccount;
	this.account=account;
}

	public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public int getCustomer_phonenum() {
	return customer_phonenum;
}
public void setCustomer_phonenum(int customer_phonenum) {
	this.customer_phonenum = customer_phonenum;
}
public int getCustomerAccount() {
	return customeraccount;
}
public void setAccount(int customeraccount) {
	this.customeraccount = customeraccount;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}

void getCustomerDetailsFromUser() {
	System.out.println("please enter the customer id:"+customerid);
    customerid=scanner.nextInt();
    scanner.nextLine();
	System.out.println("please enter the customer name:"+customername);
	customername=scanner.nextLine();
	System.out.println("please enter the customer_phonenum:"+customer_phonenum);
	customer_phonenum=scanner.nextInt();
	System.out.println("please enter the customeraccount:"+customeraccount);
	customeraccount=scanner.nextInt();
}

void getCustomerDetailsFromUser(Account account ) {
	System.out.println("please enter the customer id:"+customerid);
    customerid=scanner.nextInt();
    scanner.nextLine();
	System.out.println("please enter the customer name:"+customername);
	customername=scanner.nextLine();
	System.out.println("please enter the customer_phonenum:"+customer_phonenum);
	customer_phonenum=scanner.nextInt();
	System.out.println("please enter the customeraccount:"+customeraccount);
	customeraccount=scanner.nextInt();
	this.account=account;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
