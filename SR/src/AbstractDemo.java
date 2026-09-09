abstract class Vehicle {
			abstract void drive();
			void applyBreak()
			{
				System.out.println("Applying Break");
			}
		}
		class Car extends Vehicle{
			void drive() {
				System.out.println("driving a car");
			}
			void changeGear() {
				System.out.println("changing gear");
			}
		}
public class AbstractDemo {
	public static void main(String[] args) {
		//Vehicle v=new Vehicle;//error
		Vehicle v=new Car();
		v.drive();
		v.applyBreak();
		//v.changeGear;//error
		Car c = new Car();
		c.changeGear();
	}

}
