package com;

public class Palindrome {
	static boolean pal(int n) {
		int s=0,num=n,r;
		while(n>0) {
			r=n%10;
			s=s*10+r;
			n/=10;
		}
		if(s==num)
			return true;
		else
			return false;
	}
}
