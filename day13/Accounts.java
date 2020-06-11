package day13;




import java.util.*;
public class Accounts {
	ArrayList<AccountMethod> accounts;
	Scanner scanner;
	
	Accounts(){
		scanner = new Scanner(System.in);
		accounts = new ArrayList<AccountMethod>();
	}
	public void addAccount() {
		AccountMethod account  = new AccountMethod();
		account.GetAccountDetails();
		accounts.add(account);
	}
	public void addAccountss() {
		
		String choice = "No";
		do {
			addAccount();
			System.out.println("Do u want to add more Account details?? Key in Yes for next entry and No for quiting");
			choice = scanner.nextLine();
		} while (!choice.toLowerCase().equals("no") );
		
		System.out.println("Account details added");
		System.out.println("--------------------");
	}
	/*Customers findcustomerIndex(int age)
	{
		for(Customers customer : customers1) {
			if(customer != null)
			{
				if(customer.getAge()==age) {
					return customer;
				}
			}
		}
		return  null;
	}
	Customers findcustomerrIndex(int id)
	{
		for(Customers customer : customers1) {
			if(customer != null)
			{
				if(customer.getId()==id)
				{
					return customer;
				}
			}
		}
		return null;
	}
	public void comparecustomers1() {
		int id1=0,id2=0;
		Customers m1,m2;
		
		System.out.println("Please enter the first customer id to be compared");
		id1 = scanner.nextInt();
		m1= findcustomerrIndex(id1);
		if(m1==null)
		{
			System.out.println("No such customer details please try again from start");
			comparecustomers1();
		}
		System.out.println("Please enter the second customer id to be compared");
		id2 = scanner.nextInt();
		m2= findcustomerrIndex(id2);
		if(m2==null)
		{
			System.out.println("No such customer details please try again from start");
			comparecustomers1();
		}
		if(m1.equals(m2))
			System.out.println("The customers are just the same");
		else
			System.out.println("Not same");
		System.out.println("--------------------");
	}
	public void deletecustomerDetails() {
		int id1=0;
		System.out.println("Please enter the customer  id to be deleted");
		id1 = scanner.nextInt();
		Customers m1 = findcustomerrIndex(id1);
		if(m1 == null)
		{
			System.out.println("No such customer");
			System.out.println("No customer deleted");
		}
		else	
		{
			System.out.println("The customer to be deleted is ");
			System.out.println(m1);
		customers1.remove(m1);
			System.out.println("customer details deleted");
			System.out.println("--------------------");
		}
			
	}
	public void updatecustomerDetails() {
		int age1=0;
		System.out.println("Please enter the customer age to be updated");
		age1 = scanner.nextInt();
		Customers m1 = findcustomerIndex(age1);
		System.out.println("The customer details for updation");
		if(m1==null)
		{
			System.out.println("No such details");
		}
		else
		{
			System.out.println(m1);
			System.out.println("--------------------");
			
			System.out.println("Please enter the customer phone for updation");
			String phone = scanner.nextLine();
			scanner.nextLine();
			System.out.println("Please enter the customer age for updation");
			int age = scanner.nextInt();
	    	m1.setAge(age);
			m1.setPhone(phone);
			System.out.println("Update success");
			System.out.println("The updated movie details");
			System.out.println(m1);
			System.out.println("--------------------");
			
		}
	}
	public void printMovie() {
		int id1=0;
		System.out.println("Please enter the customer  id to be printed");
		id1 = scanner.nextInt();
		Customers m1 = findcustomerrIndex(id1);
		System.out.println("The selected Movie details");
		if(m1==null)
		{
			System.out.println("No such movie");
		}
		else
			System.out.println(m1);
		System.out.println("--------------------");
	}
	
	public void printAllMovies() {
		for (Customers customer : customers1) {
			System.out.println(customer);
			System.out.println("--------------------");
		}
	}*/
	void printMenu() {
		int userChoice = 0;
		do {
			System.out.println("--------------------");
			System.out.println("1. Adding a new customer");
			System.out.println("2. exit");
			System.out.println("--------------------");
			userChoice  = scanner.nextInt();
			switch (userChoice ) {
			case 1:
			
				addAccountss();				
				break;
			
			case 2:
				System.out.println("exiting.....");
				break;
			default:
				System.out.println("Invalid option.. Try again");
				break;
			}
			
		} while (userChoice!=2);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accounts ac = new Accounts();
		ac.addAccountss();
		ac.printMenu();
	}

}