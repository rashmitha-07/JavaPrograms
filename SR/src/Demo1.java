class C{
	int a=10,b=20;
	public String toString() {
		return a+" Class A"+b;
	}
}
public class Demo1{
	public static void main(String[]args) {
		C a1=new C();
		C a2=new C();
		System.out.println(a1+" : "+a2);
	}

}
