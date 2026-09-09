abstract class Shape1{
	void display() {
		System.out.println("Shape base class");
	}
	abstract double area();
}
class Rectangle1 extends Shape1{
	double l,b;
	Rectangle1(double l,double b){
		this.l=l;
		this.b=b;
	}
	double area() {
		return l*b;
	}
}
class Circle1 extends Shape1{
	double r;
	Circle1(double r){
		this.r=r;
	}
	double area() {
		return Math.PI*r*r;
	} 
}
public class AbstractClassDemo {
	public static void main(String[] args) {
		Rectangle1 r=new Rectangle1(12,5);
		System.out.println("Area of Rectangle: "+r.area());
		Circle1 c=new Circle1 (12.5);
		System.out.print("Area of Circle: "+c.area());
	}


}
