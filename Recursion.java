package MoreClases;

public class Recursion {

	public static void main(String[] args) {

		FactorialR f = new FactorialR();
		
		System.out.println("factorials using recursive methods");
		System.out.println("factorial of 3 is: "+f.factR(2));
		System.out.println("factorial of 4 is: "+f.factR(4));
		System.out.println("factorial of 5 is: "+f.factR(5));
		System.out.println("factorial of 6 is: "+f.factR(6));
		System.out.println();
		
		System.out.println("factorials using iterative methods");
		System.out.println("factorial of 3 is: "+f.factR(3));
		System.out.println("factorial of 4 is: "+f.factR(4));
		System.out.println("factorial of 5 is: "+f.factR(5));
		

	}

}
