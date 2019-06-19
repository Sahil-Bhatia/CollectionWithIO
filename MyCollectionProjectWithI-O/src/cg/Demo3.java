package cg;
import java.util.*;
public class Demo3 {
public static void main(String[] args) {
	Map<String,Double> m=new HashMap<>();
	//Map<String,Double> m=new TreeMap<>();//Sorting based on keys
	m.put("Ram",5000.0);
	m.put("Sham",7000.0);
	m.put("Abdul",9000.0);
	m.put("Ganesh",4000.0);
//	m.put(null,5000.0);
//	m.put("Ram",5000.0);
//	m.put("Ram",5000.0);
	System.out.println(m);
	System.out.println(m.size());
	
	Set<String> keysSet=m.keySet();
	
	System.out.println(keysSet);
	
	
	for(String k:keysSet)
	{
		double val=m.get(k);
		System.out.println(k+" has balance of Rs. "+val);
		
	}
	
	System.out.println("======================");
	double bal=m.get("Sham");
	System.out.println("Sham balance before withdraw: "+bal);
	bal=bal-3000;
	m.put("Sham",bal);
	System.out.println("Sham balance after withdraw: "+bal);
	System.out.println("======================");
	System.out.println(m);
	
	//Sorting
	Collection<Double> vals=m.values();
	List<Double> vallist=new ArrayList<Double>(vals);
	
	Collections.sort(vallist);
	
	for(double d: vallist)
	{
		System.out.println(d);
	}
	
	
	
}
}
