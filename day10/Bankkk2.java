package day10;

import java.util.ArrayList;
public class Bankkk2
{
	@Override
	 public boolean equals(Object tmp) {
			if(tmp.toString().equals(tmp.toString()))
				return true;
			else
				return false;
		}
     public static void main(String [] args)
     {
    	
          ArrayList<Bankkk> al= new ArrayList<Bankkk>();
          al.add(new Bankkk("raja","123",  102));
          al.add(new Bankkk("Ebbi","321",  101));
       
         for (Bankkk tmp: al){
              System.out.println(tmp);
              if(tmp.equals(tmp))
      			System.out.println("");
      		else
      			System.out.println("");
          }
     }
}