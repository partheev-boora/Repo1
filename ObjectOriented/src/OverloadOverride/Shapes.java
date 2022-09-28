package OverloadOverride;
class Rectangle{
	int l,b;
	int area(int a,int c) {
		l=a;
		b=c;
		int area=l*b;
		return area;
	}
}
class Square{
	int s;
	int area(int a) {
		s=a;
		int area=s*s;
		return area;
	}
}
public class Shapes {
public static void main(String a[]) {
	Rectangle r=new Rectangle();
	Square S=new Square();
	System.out.println(r.area(9, 5));
	System.out.println(S.area(7));
}
}
