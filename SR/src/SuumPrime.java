
public class SuumPrime {
	public static void main(String[] args) {
		int f=0,sum=0;
		for(int i=2;i<=100;i++)
		{
			f=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0) {
					f=1;
					break;
				}
			}
			if(f==0)
			{
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println("\nSum of primes between 2 to 100"+sum);
	}

}
