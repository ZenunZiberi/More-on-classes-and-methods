package MoreClases;

public class StaticBlock {

		static double rootof2;
		static double rootof3;
		
		static {
			System.out.println("inside static block");
			rootof2=Math.sqrt(2);
			rootof3=Math.sqrt(3);
			}
		
		StaticBlock (String msg){
			System.out.println(msg);
		}
}
