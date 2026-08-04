import java.util.Scanner;
public class SumN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter "+(i+1)+" st/re/th number: ");
			n=sc.nextInt();
			sum+=n;
		}
		System.out.println("Sum:"+sum);
	}

}
