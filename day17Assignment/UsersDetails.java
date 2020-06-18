package day17Assignment;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

//import day14.Account;


public class UsersDetails extends Userr {
	  ArrayList<UsersDetails> accDetails;
      Scanner scanner;
    
      UsersDetails(){
             scanner = new Scanner(System.in);
             accDetails = new ArrayList<UsersDetails>();
      }
      public void addAccount() {
    	  UsersDetails account  = new UsersDetails();
    		account.GetDetailsFromUser();
    		accDetails.add(account);
    	}
    	public void addAccounts() {
    		

    		String choice = "No";
    		do {
    			addAccount();
    			
    			System.out.println("Do u want to Add Another Account?? Key in Yes for next entry and No for quiting");
    			choice = scanner.nextLine();
    			
    		} while (!choice.toLowerCase().equals("no"));
    	}
    	public void printaccount() {
    		for (UsersDetails customer : accDetails) {
    			System.out.println(customer);
    			System.out.println("--------------------");
    		}
    	}
    	
    	/*int ageCalculation (String dob) {
    	    int age = 0;
    	           DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	           LocalDate localDate = LocalDate.parse(dob, formatter);
    	      LocalDate now = LocalDate.now();
    	      Period diff = Period.between(localDate, now); 
    	      age = diff.getYears();
    	    return age;}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsersDetails am = new UsersDetails();
am.addAccounts();
am.printaccount();

	}

}