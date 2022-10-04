package Lambda;
import java.util.function.BiFunction;  

class mul{
	int print(int a, int b) {
		return a*b;
	}
}
public class Bifunc {

public static void main(String args[]) {
	int a=10,b=4;
	BiFunction<Integer,Integer,Integer> multiplier=new mul()::print;
	int res=multiplier.apply(a,b);
	System.out.println(res);
}
}
