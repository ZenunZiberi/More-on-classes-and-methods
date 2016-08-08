package MoreClases;

public class Err {

	String msg;
	int severity;
	
	Err (String m, int s){
		this.msg=m;
		this.severity=s;
	}
	
	
	}
		
	class ErrorInfo {
	
		String msg[]={"Output Error","input error","Disk full","index out of bounds"};
		int howbad[]={3,3,2,4};
		 
		public Err getErrorInfo(int i){
			if(i>=0&&i<msg.length) {
				Err errObj = new Err(msg[i],howbad[i]);
				//errObj.changeMe("hkjwehdjfkew");
				return errObj;
			}
			else {
				return new Err("invalid error code ",125);
			}
		}
	} 		
	
