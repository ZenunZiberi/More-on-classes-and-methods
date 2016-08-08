package MoreClases; 		

		/*overloading Variable methods (VarArgs) */

public class VarArgs3 {

		static void vaTest(int ... v){         //first version vaTest
			System.out.println("vaTest(int...: "+"number of length: "+v.length);
			System.out.println("contents: ");
			for(int i=0; i<v.length;i++){
				System.out.println("arg"+i+" "+v[i]);
				
			}
			System.out.println();
		}
		
		static void vaTest(boolean ... v){		//second version vaTest
			System.out.println("vaTest(int...: "+"number of length: "+v.length);
			System.out.println("contents: ");
			for(int i=0; i<v.length;i++){
				System.out.println("arg"+i+" "+v[i]);
			}
			System.out.println();
			
		}
		
		static void vaTest(String msg, int ... v){         //third version vaTest
			System.out.println("vaTest(int...: "+"number of length: "+msg+v.length);
			System.out.println("contents: ");
			for(int i=0; i<v.length;i++){
				System.out.println("arg"+i+" "+v[i]);
				
				
			}
			System.out.println();
		}
		
		public static void main(String[]args){
			
			vaTest(4566,456,4574,10);
			vaTest(true,false,true,true , false,1<2);
			vaTest("olalalaaa", 12,34,45);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
