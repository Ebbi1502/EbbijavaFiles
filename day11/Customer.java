package day11;
import java.util.Scanner;

public class Customer {
	String Name,Phone;
	int age,id;
	
		Scanner scanner;
		Customer(){
		scanner = new Scanner(System.in);
		}
		

Customer(String Name,String Phone,int id,int age){
	scanner = new Scanner(System.in);
	this.id = id;
	this.Name = Name;
	
	this.age = age;
	this.Phone = Phone;
}

public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getPhone() {
	return Phone;
}
public void setPhone(String phone) {
	Phone = phone;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


void getCustomerDetailsFromUser(){
	System.out.println("Enter Customer id");
	id = scanner.nextInt();
	 scanner.nextLine();
	System.out.println("Enter Customer Name");
    Name = scanner.nextLine();
    System.out.println("Enter Customer age");
    age = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter Customer Phone Number");
    Phone = scanner.nextLine();
    
}


/*void PrintCustomerDetails() {
	System.out.println("Customer id : "+id);
	System.out.println("Customer Name : "+ Name);
	
	System.out.println("Customer age : "+ age);
	System.out.println("Customer Phone : "+ Phone);
}*/
@Override
public String toString(){
	return "Customer id : "+id+"\nCustomer Name : "+ Name+"\nCustomer age : "+ age+"\nCustomer Phone : "+ Phone.replaceAll("\\d(?=\\d{2})", "X");
}


@Override
public boolean equals(Object obj) {
	Customer c2 = (Customer)obj;
	Customer C1 = this;
	if(C1.getName().equals(c2.getName()) && C1.getPhone()==c2.getPhone())
		return true;
	else 
		return false;
}

}
