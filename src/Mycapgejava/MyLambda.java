package Mycapgejava;
interface Code {
	public void execute(int a, int b);
}
interface Hello {
	public void print();
}
interface StringUpper {
	public String toUpper(String str);
}

//Write a lambda to take the string and return the first character
//write a lambda to print even or odd number 
//write a lambda to check for positive or negative number
//write a lambda to return cube root x*x*x
//write a lambda to print 1to 10 value using loop;

public class MyLambda {
	public static void main(String[] args) {

		// use to store the value in variable
		// able to store the code or method in variable
		// with help of lambda it is possible
		// we do not need the access modifier
		// we also do not need the return type
		// remove the method name because you can call by variable name
		// add the lambda symbol
		// method cannot store in normal or primitive data type
		// create a interface
		// create object of interface which will hold the value for method
		// remove the input type also
		// sum of two number
		Code c = (a, b) -> System.out.println(a + b);
		c.execute(17, 34);

		// write the lambda to print hello world

		Hello hello = () -> System.out.println("HelloWorld616");
		hello.print();

		// lambda to return the string in upper case
		// if single input parameters remove the bracket
		// remove the return keyword
		StringUpper upper = str ->str.toUpperCase();
		String str = upper.toUpper("jeevan");
		System.out.println(str);
	}

	public String toUpper(String str) {
		return str.toUpperCase();
	}

	public void print() {
		System.out.println("HelloWorld616");
	}

	public void sum(int a, int b) {
		System.out.println(a + b);
	}
}
