package Lambda;

import java.util.ArrayList;
import java.util.List;

public interface student {

	String print(ForEach Students);
}
class ForEach implements student{
	public static void main(String args[]) {
		List<String> students=new ArrayList<String>();
		students.add("Isabell");
		students.add("gabriel");
		students.add("David");
		students.add("feroz");
		students.forEach(student->System.out.println(student));
		//student g=stu->System.out.println(stu);
	}

	@Override
	public String print(ForEach Students) {
		// TODO Auto-generated method stub
		return null;
	}
	
}