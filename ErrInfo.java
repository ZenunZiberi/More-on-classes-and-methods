package MoreClases;

public class ErrInfo {



			public static void main(String[] args) {

				ErrorInfo err = new ErrorInfo();
				Err e=new Err("s",3);
				
				e=err.getErrorInfo(3);
				System.out.println(e.msg+" severity: "+e.severity);
				
				e=err.getErrorInfo(4);
				System.out.println(e.msg+" severity: "+e.severity);

			}

		}



