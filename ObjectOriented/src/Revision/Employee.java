package Revision;

import java.util.function.BiFunction;

public class Employee implements Salary,Leaves{

	@Override
	public void sick() {
		// TODO Auto-generated method stub
		System.out.println("Sick leave");
	}

	@Override
	public void holiday() {
		// TODO Auto-generated method stub
		System.out.println("Statutory holiday");
	}

	@Override
	public void casual() {
		// TODO Auto-generated method stub
		System.out.println("casual leave");
	}

	@Override
	public int sal(int n,int m) {
		// TODO Auto-generated method stub
		return n-m;
	}
	public static void main(String args[]) {
		Employee emp=new Employee();
		BiFunction<Integer,Integer, Integer>sall=new Employee()::sal;
		System.out.println(sall.apply(5000,3000));
		emp.casual();
		emp.holiday();
		emp.sick();
	}
}
