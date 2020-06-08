package day10;

public class CheckEquality {
	String name;
	String type;
	String number;
	 Float balance;
	 CheckEquality (){
			number = "321456746908";
			name = "Ebbi";
			type = "saving";
			balance = (float) 1750.0;
	 }
	 CheckEquality(String number,String name,String type,float balance){
			this.number = number;
			this.name = name;
			this.type = type;
			this.balance =balance;
	 }
	 
	@Override
	 public String toString() {
			String data = "Number is : "+number+
					"\nName is : "+name+
					"\nType is : "+type+
					"\nbalance is "+balance;
			return data;
		}
	@Override
	public boolean equals(Object obj) {
	CheckEquality other = ( CheckEquality)obj;//Type cast
		if(this.number == other.number)
			return true;
		else
			return false;
	}
		
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckEquality check1 = new CheckEquality("321456746908","Ebbi","current",(float) 1750.00);
		CheckEquality check2 = new CheckEquality("456421479086","Thomas","savings",(float)1750.00);
		System.out.println(check1);
		System.out.println(check2);
		if(check1.equals(check2))
			System.out.println("Both have same details");
		else
			System.out.println("Both have different data");
	}

}