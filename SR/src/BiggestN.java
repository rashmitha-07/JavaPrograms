import java.util.Scanner;
public class BiggestN {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n, big=0;
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter"+(i+1)+" st/rd/th number: ");
			n=sc.nextInt();
			if(big<n) {
				big=n;
			}
		}
		System.out.println("Big: "+big);
	}

}
