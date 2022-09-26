package Practice;

public class Square extends Area{
    void area() {System.out.println("Square");}
    public static void main(String a[]) {
    	Area A=new Area();
    	A.area();
    	Square s=new Square();
    	s.area();
    }
}
