package MoreClases;
  public  class Varargs {

	  static void vaTest(String msg , int ... v){
			System.out.println(msg+v.length);
			System.out.println("contents: ");
			
			for (int i=0;i<v.length;i++)
				System.out.println("arg: "+i+" "+v[i]);
			
			System.out.println();
			
		}
  


			public static void main(String args[]) {
				
				
				vaTest("one vararg", 19);
				vaTest("two vararg",25,26,27);
				vaTest("no varargs");
				
				
				
			
			}
}