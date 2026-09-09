interface Drawable{
	int MAX_SIZE=1000;
	void draw();//public abstract(implicity)
	void resize(int factor);//another abstarct method
	
	//default method(java 8+) -has a body!
	default void describe() {
		System.out.println("I am a drawable shape");
		
	}
	//static method(java 8+)
	
	static Drawable createDefault() {
		return new Circle3();		
	}
}
//2.IMPLEMENTING an interface
class Circle3 implements Drawable{
	@Override
	public void draw() {
		System.out.println("drawing a circle.....");
	}
	@Override
	public void resize(int factor) {
		System.out.println("resizing circle by"+factor);
 }
}