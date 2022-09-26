package Practice;

public class Rectangle extends Area{
	void area() {
		System.out.print("Rectangle");
	}
public static void main(String a[]) {
	Area A=new Area();
	A.area();
	Rectangle r=new Rectangle();
	r.area();
}
}
