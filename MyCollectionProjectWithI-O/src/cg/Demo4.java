package cg;
import java.util.*;
import com.cg.bean.*;
public class Demo4 {
	public static void main(String[] args) {
		
		Map<Long,Account> accmap=new TreeMap<>();
		Account ob1=new Account(101,12345678,"Ram",25000.00);
		accmap.put(ob1.getMobile(),ob1);
		Account ob2=new Account(102,12345679,"Sham",50000.00);
		accmap.put(ob2.getMobile(),ob2);
		Account ob3=new Account(105,12345670,"Abdul",15000.00);
		accmap.put(ob3.getMobile(),ob3);
		Account ob4=new Account(103,12345671,"Ganesh",45000.00);
		accmap.put(ob4.getMobile(),ob4);
		System.out.println(accmap);
		System.out.println(accmap.keySet());
		System.out.println("=======================Sort by Account Number");
		Collection<Account> vc=accmap.values();
		List<Account> acclist=new ArrayList<>(vc);
		Collections.sort(acclist);
		
		for(Account o: acclist) {
			System.out.println(o);
		}
		System.out.println("=======================Sort by NAME");
		Comparator nc=new NameComparator();
		Collections.sort(acclist,nc);
		for(Account o: acclist) {
			System.out.println(o);
		}
		System.out.println("=======================Sort by BALANCE");
		Comparator bc=new BalanceComparator();
		Collections.sort(acclist,bc);
		for(Account o: acclist) {
			System.out.println(o);
		}
	}

}
