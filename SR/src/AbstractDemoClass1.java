interface  Shape2{
	double area();
}
class Rectangle2 implements Shape2{
	double l,b;
	Rectangle2(double l,double b){
		this.l=l;
		this.b=b;
	}
	public double area() {
		return l*b;
	}
}
class Circle2 implements Shape2{
	double r;
	Circle2(double r){
		this.r=r;
	}
	public double area() {
		return Math.PI*r*r;
	} 
}
public class AbstractDemoClass1 {
	public static void main(String[] args) {
		Shape2 s;
		 s=new Rectangle2(12,5);
		System.out.println("Area of Rectangle: "+s.area());
		s=new Circle2 (12.5);
		System.out.print("Area of Circle: "+s.area());
	}


}
