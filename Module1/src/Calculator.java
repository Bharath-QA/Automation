
public class Calculator {

	//Add, Subtract, Multiply and Divide of two numbers
	//First We need to create a methods for each of them by below.
	
	//To Execute main method write as below and create a instance of class to store all values.
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		
		//Call each method using the created object 'basicCal'
		basicCal.Addition(30,20);
		basicCal.Multiply(30, 20);
		basicCal.Divide(30, 20);
		basicCal.Subtract(30, 20);
				
	}
	
	
	//To create a method use public void
	
	public void Addition(int num1, int num2) {
		int Sum = num1 + num2;
		System.out.println(Sum);
		
	}
	
	public void Subtract(int num1, int num2) {
		int Diff = num1 - num2;
		System.out.println(Diff);
		
	}
	
	public void Multiply(int num1, int num2) {
		int Product = num1 * num2;
		System.out.println(Product);
	}
	
	public void Divide(int num1, int num2) {
		int Div = num1/num2;
		System.err.println(Div);
	}
}
