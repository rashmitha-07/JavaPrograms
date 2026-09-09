abstract class Shape{
	String color="Green";
	//Abstarct method-no body!
	abstract double area();
	
	//concrete method
	void display() {
		System.out.println("Color: " + color);
	}
}
class Circle1 extends Shape{
	double radius;
	Circle1(double radius)
	{
		this.radius=radius;
	}
	
	@Override
	double area() {
		return Math.PI*radius*radius;
	}
}
public class AbstarctClass_Eg {
	public static void main(String[]args) {
		Circle1 c=new Circle1(12.50);
		System.out.println("Circle Area: "+c.area());
		c.display();
		
	}

}
