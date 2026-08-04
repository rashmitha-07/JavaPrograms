import java.util.Scanner;
public class ArraySearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int s=sc.nextInt();
		int k,f=-1;
		int Arr[]=new int[s];
		for(int i=0;i<Arr.length;i++)
		{
			System.out.println("Arr["+i+"]:");
			Arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to searched! ");
		k=sc.nextInt();
		for(int i=0;i<Arr.length;i++)
		{
			if(k==Arr[i])
			{
				f=i;
				break;
			}
		}
		if(f>=0)
		{
			System.out.println(k+"founded at index"+f);
		}
		else {
			System.out.println(k+"not founded");
		}
	}
}
