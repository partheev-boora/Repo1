package Lambda;

public interface MentalStatus {
	String status(String s);
}

class Mentals implements MentalStatus{
	public static void main(String args[]) {
		Mentals m=new Mentals();
		MentalStatus stat=(s)->{return s;};
		System.out.println(m.status("Mental"));
	}

	@Override
	public String status(String s) {
		// TODO Auto-generated method stub
		return s;
	}
}
