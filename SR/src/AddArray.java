import java.util.Scanner;
public class AddArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int s=sc.nextInt();
        int sum=0;
        int Arr[]=new int[s];
        for(int i=0;i<Arr.length;i++)
        {
        	System.out.println("Arr["+i+"]:");
        	Arr[i]=sc.nextInt();
        }
        for(int c:Arr)
        {
        	System.out.print(c+" ");
        	sum+=c;
        }
        System.out.println("\nSum of array elements: "+sum);
	}

}
