import java.util.Scanner;
public class Price {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int option,itemNumber,quantity;
		double rate,prize;
		String itemName;
		do {
			System.out.println("Enter Item Number");
			itemNumber=sc.nextInt();
			System.out.println("Enter Item Name");
			sc.next();
			itemName=sc.nextLine();
			System.out.println("Enter Rate");
			rate=sc.nextDouble();
			System.out.println("Enter Quantity");
			quantity=sc.nextInt();
			prize=rate*quantity;
			System.out.println("Item number:"+itemNumber+" Name: "+itemName+" Rate: "+rate);
			System.out.println("Enter option");
			option=sc.nextInt();
		}while(option!=1);
		System.out.println("Thank you!!");
		


		}
	}
