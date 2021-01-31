public class Constructorwithargs {
	
	int a;
	public Constructorwithargs(int b) {
		a=b;
	}

	public static void main(String[] args) {
		Constructorwithargs myObj = new Constructorwithargs(5);
System.out.println(myObj.a);
	}
}