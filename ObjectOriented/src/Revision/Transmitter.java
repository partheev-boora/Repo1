package Revision;

import java.util.function.BiFunction;

public class Transmitter {
	String audio, video;
	Transmitter(){
		audio=null;
		video=null;
	}
	Transmitter(String audio){
		System.out.println("Transmits audio only");
	}
	Transmitter(String video,String audio){
		System.out.println("Transmits audio and video");
	}
	void display() {
		System.out.println("Movie");
	}
	void programme() {
		System.out.println("News");
	}
	int price(int n, int m) {
		return n;
	}
}
class Device extends Transmitter implements I1{
	public static void main(String args[]) {
		Transmitter radio= new Transmitter("audio");
		Transmitter tv=new Transmitter("audio","video");
		radio.programme();
		tv.display();
		BiFunction<Integer,Integer,Integer>a=new Transmitter()::price;
		int res=a.apply(500,6);
		I1 cal =new Device();
		int c=cal.add(6, 7);
		int d=cal.mul(6, 7);
		cal.displayy(c);
		cal.displayy(d);
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public void displayy(int n) {
		// TODO Auto-generated method stub
		System.out.println(n);
	}
}
