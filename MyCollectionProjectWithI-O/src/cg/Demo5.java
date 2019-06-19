package cg;
import java.util.*;
import com.cg.bean.*;
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================Sort by NAME");
		Comparator nc=new NameComparator();
Set<Account> accset=new TreeSet<>(nc);
Account ob1=new Account(101,12345678,"Ram",25000.00);
accset.add(ob1);
Account ob2=new Account(102,12345679,"Sham",50000.00);
accset.add(ob2);
Account ob3=new Account(105,12345670,"Abdul",15000.00);
accset.add(ob3);
Account ob4=new Account(103,12345671,"Ganesh",45000.00);
accset.add(ob4);
for(Account o: accset) {
	System.out.println(o);
}
	}

}
