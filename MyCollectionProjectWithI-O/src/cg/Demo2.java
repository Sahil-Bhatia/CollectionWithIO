package cg;

import java.util.*;

public class Demo2 {
	public static void main(String[] args) {
		// generic collection
		
//		Set<String> col=new HashSet<>(); //unodered 
////		Set<String> col=new LinkedHashSet<>(); //Maintains insertion order //set doesn't allow duplicates
//		Set<String> col=new TreeSet<>(); //Doesn't allow null as object throws NullPointerException //Tree set follows natural order //sorted
		List <String> col=new ArrayList<>();
		col.add("Ram"); 
		col.add("Sham");
		col.add("Abdul");
		//col.add(55); //new integer(55); //auto boxing
		col.add(null);
		col.add("Ganesh");
		col.add("Ram");
		col.add(null);
		System.out.println(col.size());
		//for(String o:col)System.out.println(o);
		
		Iterator <String> i=col.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}