package source;
import java.util.*;  
public class TreeMapExample {

	public static void main(String[] args) {
		 TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
	      map.put(103,"RRR"); 
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());   
	    	  //System.out.println(m);
	      }    

	}

}
