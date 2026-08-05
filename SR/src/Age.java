import java.util.Scanner;
public class Age {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age:");
	int age=sc.nextInt();
	if(age>=0)
	{
		if(age>=18)
		{
			System.out.println("Major");
		}
		else
		{
			System.out.println("Minor");
		}
	}
	else {
		System.out.println("Invalid Age!!");
		sc.close();
	}
	}

}
