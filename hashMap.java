package source;

import java.util.*;
//unique key process

public class hashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
	      map.put(null,"RRR"); 
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());   
	    	  //System.out.println(m);
	      }    

	}

}
