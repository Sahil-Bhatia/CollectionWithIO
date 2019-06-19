package cg;
import java.util.*;
import java.io.*;
import com.cg.service.*;
import com.cg.bean.*;
public class Demo7 {
	public static void main(String[] args) throws IOException {
		
		Map<Long,Account> accmap=new TreeMap<>();
//		Account ob1=new Account(101,12345678,"Ram",25000.00);
//		accmap.put(ob1.getMobile(),ob1);
//		Account ob2=new Account(102,12345679,"Sham",50000.00);
//		accmap.put(ob2.getMobile(),ob2);
//		Account ob3=new Account(105,12345670,"Abdul",15000.00);
//		accmap.put(ob3.getMobile(),ob3);
//		Account ob4=new Account(103,12345671,"Ganesh",45000.00);
//		accmap.put(ob4.getMobile(),ob4);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String choice="";
		//Repeat ask again & again 
		while(true) {
		System.out.println("Menu: ");
		System.out.println("======= ");
		System.out.println("1. Create New Account ");
		System.out.println("2. Print All Accounts ");
		System.out.println("3. Exit ");
		System.out.println("Enter your choice: ");
		choice=br.readLine();
		
		switch(choice){
		case "1":	int id=0;
					long mb=0;
					String ah="";
					double bal=0.0;
					//Accepting & validating input for account number
					System.out.println("Enter Account No.: ");
					while(true)
					{
						String s_id=br.readLine();
						boolean ch1=Validator.validatedata(s_id, Validator.aidpattern);
						if(ch1==true) {
							try
							{
								id=Integer.parseInt(s_id);
								break;
							}catch(NumberFormatException e)
							{
								System.out.println("Account No. must be numeric. ReEnter.");
							}
						}
						else {
							System.out.println("ReEnter Account Number in 3 digits."); 
			
						}
					}//End of account number while

					//Accepting & validating input for account mobile
					System.out.println("Enter Mobile No.: ");
					while(true)
					{
						String s_mobile=br.readLine();
						boolean ch1=Validator.validatedata(s_mobile, Validator.mobilepattern);
						if(ch1==true) {
							try
							{
								mb=Long.parseLong(s_mobile);
								break;
							}catch(NumberFormatException e)
							{
								System.out.println("Mobile No. must be numeric. ReEnter.");
							}
						}
						else {
							System.out.println("ReEnter Mobile Number in 10 digits."); 
			
						}
					}//End of Mobile number while
					
					//Accepting & validating account holder
					System.out.println("Enter Account Holder Name: "); //
					ah=br.readLine();
					//Accepting & validating balance
					System.out.println("Enter Initial Balance min 1000.00 : ");
					String s_bal=br.readLine();
					bal=Double.parseDouble(s_bal);
					Account ob=new Account(id,mb,ah,bal);
					accmap.put(ob.getMobile(), ob);					
					break;
		case "2": 	Collection<Account> vc=accmap.values();
					List<Account> acclist=new ArrayList<>(vc);
					Collections.sort(acclist);
		
					for(Account o: acclist) {//service.printstatement(o);
	
						System.out.println(o);}
					break;
		case "3":   System.out.println("Exiting Program");
					System.exit(0);
					break;
		default : System.out.println("Invalid Choice!"); 
		}
		
		}//End of menu
	
		
		
//		System.out.println(accmap);
//		System.out.println(accmap.keySet());
//		System.out.println("=======================Sort by Account Number");
//		Collection<Account> vc=accmap.values();
//		List<Account> acclist=new ArrayList<>(vc);
//		Collections.sort(acclist);
//		
//		for(Account o: acclist) {
//			System.out.println(o);
//		}
//		System.out.println("=======================Sort by NAME");
//		Comparator nc=new NameComparator();
//		Collections.sort(acclist,nc);
//		for(Account o: acclist) {
//			System.out.println(o);
//		}
//		System.out.println("=======================Sort by BALANCE");
//		Comparator bc=new BalanceComparator();
//		Collections.sort(acclist,bc);
//		for(Account o: acclist) {
//			System.out.println(o);
//		}
	}

}
