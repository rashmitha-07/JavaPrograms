
import java.util.Scanner;
public class MatrixSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  row size");
		int r=sc.nextInt();
		System.out.println("Enter column size");
		int c=sc.nextInt();
		int mat[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("mat["+i+"]["+j+"]");
				mat[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for (int i=0;i<r;i++)
		{
			sum+=mat[i][i];
			//for(int j=0;j<r;j++)
			//{
				//System.out.print(mat[i][j]+"");
			//}
			//System.out.println("");
		}
		System.out.println("Sum: "+sum);
	}

}
