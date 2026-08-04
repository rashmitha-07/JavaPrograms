import java.util.Scanner;
public class Secondsmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Array Size");
		int s=sc.nextInt();
		int []Arr=new int[s];
		int big=Integer.MIN_VALUE;
		int secondBig=Integer.MIN_VALUE;
		int small=Integer.MAX_VALUE;
		int secondsmall=Integer.MAX_VALUE;
		for(int i=0;i<s;i++)
		{
			System .out.println("Arr["+i+"]:");
			Arr[i]=sc.nextInt();
			
		}
		if(s>2)
		{
			for(int n:Arr)
			{
				System.out.println(n);
				if(n<small) {
					secondsmall=small;
					small=n;
				}
				else if(n<secondsmall && secondsmall!=small)
				{
					secondsmall=n;
				}
			}
		}
		else
		{
			System.out.println("2 element array not possible");
		}
		System.out.println("small:"+small+"Secondsmall:"+secondsmall);
	}

}
