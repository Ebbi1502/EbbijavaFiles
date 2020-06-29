package projecttest;

import java.util.Scanner;
import java.util.ArrayList;

public class Transaction {
	private int transaction_number;
	double balance;
	String fromAccount;
	String toAccount;
	double amount;
	ArrayList<Account> accountList;
	String type;
	String status;
	Scanner scanner;

Transaction(){
	scanner=new Scanner(System.in);
}
int withdraw() {
	System.out.println("Your Balance=" + balance);
	System.out.print("Enter amount to withdraw:");
	amount = scanner.nextInt();
	if (balance < amount) {
		System.out.println("Not sufficient balance.");
		return 1;
	}
	if (amount < 0) {
		System.out.println("Invalid Amount");
		return 1;
	}
	balance = balance - amount;
	 System.out.println("withdraw status");
		System.out.println("Your Money has been successfully withdrawn");
	return 0;
}

int Transfer() {
	System.out.println("Enter Tansaction Number: ");
	int num = scanner.nextInt();
	
	System.out.print("Enter amount to deposit:");
	amount = scanner.nextInt();
	
	scanner.nextLine();
	System.out.println("Enter Sender Accountnumber :");
	
	fromAccount=scanner.nextLine();
	System.out.println("Enter Receiver Accountnumber :");

	toAccount=scanner.nextLine();
	if (amount < 0) {
		System.out.println("Invalid Amount");
		return 1;
	}
	balance = balance + amount;
	 System.out.println("deposit status");
		System.out.println("Your Money has been successfully deposited");
	return 0;
}

void displayDetails() {
	
		System.out.println("Transaction Number:" + transaction_number);
		System.out.println("Account Type:" + type);
		System.out.println("Balance:" + balance);
}
@Override
	public String toString() {
	return "TransactionNumber "+transaction_number+"\n Amount "+amount+"\nType "+type+
			"\nStatus "+status;
	}

void transactionMethod() {
	
	
	
	System.out.println("Enter Account Type: ");
	String type = scanner.next();
	System.out.println("Enter Initial Balance: ");
	int bal = scanner.nextInt();
	int menu;
	System.out.println("Index");
	System.out.println("1. Deposit Amount");
	System.out.println("2. Withdraw Amount");
	System.out.println("3. Current Status");
	System.out.println("4. Exit");
	boolean quit = false;
	do {
		System.out.print("Please enter your choice: ");
		menu = scanner.nextInt();
		switch (menu) {
		case 1:
			Transfer();

		case 2:
			withdraw();
			break;

		case 3:
			displayDetails();
			break;

		case 4:
			quit = true;
			System.out.println("exited");
			break;
		}
	} while (!quit);


}
public static void main(String[] args) {
	Transaction transaction=new Transaction();
	transaction.transactionMethod();
	
}
}