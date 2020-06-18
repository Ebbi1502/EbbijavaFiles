/*package day17Assignment;

import java.util.ArrayList;
import java.util.Scanner;

import day14Assisnment.Account;
import day14Assisnment.SavingsAccount;


public class Login {

    ArrayList<Userr> LoginDetails;

    Scanner scanner;

    String Name , Password ;

   Login(){

           scanner = new Scanner(System.in);

           LoginDetails = new ArrayList<Userr>();

    }

   void userOperation() {
	   

	          int userChoice = 0;

	          String transOpt=null, addChoice=null;

	          

	        

	              System.out.println("Please select a number \r\n" +

	                                  "1) Login");
	                
	          
	                 
	                
	          Scanner input = new Scanner(System.in);
	          String user,pass;
	          System.out.println("Enter your name");
	          	user = input.nextLine();
	          	System.out.println("ENter the password");
	          	pass = input.nextLine();
	          	
	          	if(user.contentEquals(null) && (pass.equals(null))) {
	          		System.out.println("Welcome");
	          		
	          	}else {
	          		System.out.println("Incorrect");
	          	}
                                      
	      
   }

	                                     
	    

	public static void main(String[] args) {
		Login = new Login();

	}

}
Account sObj = new SavingsAccount();

sObj.takeAccountDetails();*/

