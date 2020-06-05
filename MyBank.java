package bank;
import java.util.Scanner;
public class MyBank {
	
	Account[] accounts;
	public void createAccount(int n) {
	    accounts=new Account[n];
	}
	
	MyBank(){}
	MyBank(int n){
			accounts=new Account[n];
		}
	
	
	
	void addAccount() {
		for (int i = 0; i < accounts.length; i++) {
			accounts[i]=new Account();
			accounts[i].getAccountDetailsFromUser();	
		}
	}
	void listAllAccounts() {
		for(int i=0;i<accounts.length;i++) {
		accounts[i].printAccountDetails();	
		}
}
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
        System.out.println("Enter the no of acccount: ");
        int n = sc.nextInt();
        NumberOfAcc bank=new NumberOfAcc(n);
        bank.createAccount(n);
        bank.addAccount();
        bank.listAllAccounts();
}
}