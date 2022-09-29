package OverloadOverride;
class Rectangle extends Draw{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle");
	}
}
class Square extends Draw{
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square");
	}
	
	
}

public class Shapes {
	public static void main(String a[]) {
		Rectangle r=new Rectangle();
		Square p=new Square();
		r.draw();
		p.draw();
	}
}
