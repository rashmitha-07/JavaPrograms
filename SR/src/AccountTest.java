import java.util.Scanner;
class Customer{
	int custId;
	String custName,custAddress;
	Customer(int custId,String custName,String custAddress){
		this.custId=custId;
		this.custName=custName;
		this.custAddress=custAddress;
		
	}
	void display() {
		System.out.println("Customer Id: "+custId+" Customer Name: "+custName+"Customer Address: "+custAddress);
	}
}
class Accountp{
	int acctId;
	String accType;
	Customer cust;
	double acctBalance;
	Accountp(int acctId,String acctType,Customer cust, double acctBalance){
		this.acctId=acctId;
		this.accType=accType;
		this.cust=cust;
		this.acctBalance=acctBalance;
	}
	void dispaly() {
		cust.display();
		System.out.println("Account Id: "+acctId+" Account Type:"+accType+" Balance:"+acctBalance);
	}
}
public class AccountTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id,Name,Address:");
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		String addr=sc.nextLine();
		Customer c=new Customer(id,name,addr);
		System.out.println("Enetr Account Id,Type,Balance");
		int aid=sc.nextInt();
		sc.next();
		String type=sc.nextLine();
		double bal=sc.nextDouble();
		Accountp acc=new Accountp(aid,type,c,bal);
		acc.dispaly();
		sc.close();
	}


}
