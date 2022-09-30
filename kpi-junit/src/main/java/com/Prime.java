package com;

public class Prime {
	static boolean prime(int n) {
		boolean b=false;
		int f=0;
		//try {
		for(int i=1;i<n/2;i++) {
			if(n%i==0)
				f++;
		}
		if(f==1 || n==2)
			b=true;
		else
			b=false;
	    //}
		/*catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("Input should be greater than or equal to 1 and should be an integer");
		}*/
		return b;
}
}