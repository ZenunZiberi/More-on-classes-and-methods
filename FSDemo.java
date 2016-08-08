package MoreClases;

public class FSDemo {

	public static void main(String[] args) {
		
		FailSoftArray fsa = new FailSoftArray(5,-1);
		int x;
		
		//show quiet failure
		System.out.println("Fail quietly");
		for(int i=0; i < (fsa.length*2);i++)
			fsa.put(i, i*10);
		
		for(int i=0; i < (fsa.length*2);i++){
			x=fsa.get(i);
			if(x != -1) System.out.print(x+" ");

	}
		System.out.println();
		//now handles failure
		System.out.println("\nFail with error reports.");
		for(int i =0;i<(fsa.length*2);i++){
			if(!fsa.put(i, i*10))
				System.out.println("index"+i+"out of bounds");
		}
		for(int i =0;i<(fsa.length*2);i++){
			x=fsa.get(i);
			if(x != -1) System.out.print(x+ " ");
			else System.out.println("index "+i+" out of bounds");
		}
}
}