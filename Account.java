package bank;
import java.util.Scanner;
public class Account {
	
	private int accountnumber;
	private String accountname;
	private double accountbalance;
	
	Scanner scanner;
	
	Account(){
			scanner=new Scanner(System.in);
	}
Account(String accountname,double accountbalance){
	scanner=new Scanner(System.in);
	this.accountname=accountname;
	this.accountbalance=accountbalance;
}
Account(int accountnumber,String accountname,double accountbalance){
	scanner=new Scanner(System.in);
	this.accountname=accountname;
	this.accountname=accountname;
	this.accountbalance=accountbalance;
}
public int getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(int accountnumber) {
	this.accountnumber = accountnumber;
}
public String getAccountname() {
	return accountname;
}
public void setAccountname(String accountname) {
	this.accountname = accountname;
}
public double getAccountbalance() {
	return accountbalance;
}
public void setAccountbalance(double accountbalance) {
	this.accountbalance = accountbalance;
}
void getAccountDetailsFromUser() {
	System.out.println("please enter the accountnumber:");
	accountnumber=scanner.nextInt();
	scanner.nextLine();
	System.out.println("please enter the accountname:");
	accountname=scanner.nextLine();
	System.out.println("please enter the accountbalance:");
	accountbalance=scanner.nextDouble();
	
}
void printAccountDetails() {
	System.out.println("accountnumber:"+accountnumber+" accountname:"+accountname+"accountbalance:"+accountbalance);
	System.out.println("---------------------------------");
}
}
