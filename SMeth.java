package MoreClases;

public class SMeth {

	public static void main(String[] args) {

		System.out.println(StaticMeth.broj); 
		StaticMeth.broj=128;
		System.out.println(StaticMeth.broj);
		StaticMeth.staticMethod();
		StaticMeth.staticMethod();
		System.out.println(StaticMeth.staticMethod());

	}

}
