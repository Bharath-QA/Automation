public class MyClass {
	int x;
	int y;
	public MyClass() {
		x=5;
		y=10;
	}
	

public static void main(String[] args) {
	MyClass myObj = new MyClass();
	System.out.println(myObj.x);
	
	MyClass myObj1 = new MyClass();
	System.out.println(myObj1.y);
}
}