import java.util.Scanner;
public class SumZ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		for(;;)
		{
			System.out.println("Enter a number");
			n=sc.nextInt();
			if(n==0) break;
			sum+=n;
		}
		System.out.println("Sum: "+sum);
	}
	
}
