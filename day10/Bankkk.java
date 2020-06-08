package day10;

public class Bankkk {
	
	     String number,name;
	     int id;
	     Bankkk (String name,String number, int id)
	    {
	    	 this.name=name;
	    	 this.number=number;
	    	 
	         
	         this.id=id;
	    }
	    @Override
	    public String toString() {
	       return "Name is: "+this.name+" & number is: "+this.number+" & id is: "+this.id;
	    }
	}