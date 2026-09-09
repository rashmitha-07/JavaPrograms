public class CircleDemo {
	public static void main(String[] args) {
		Circle3 c1=new Circle3();
		c1.describe();
		c1.draw();
		c1.resize(5);
		Drawable c2=Drawable.createDefault();
		c2.describe();
		
	}

}