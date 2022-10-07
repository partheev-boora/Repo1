package Lambda;

import java.util.ArrayList;
import java.util.List;

public class ClassOfinter implements Inter{
	public static void main(String args[]) {
		ClassOfinter ci=new ClassOfinter();
		List l=new ArrayList();
		l.add(5);
		l.add('u');
		l.add("Partheev");
		l.add(8.9);
		l.add(true);
		//forEach(l->ci.print(l));
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println();
	}

}
