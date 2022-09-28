package OverloadOverride;

public class Accesories {
	void Device(String name) {
		System.out.println(name);
	}
	void Device(int price) {
		System.out.println("price is "+price);
	}
	void Device(float version) {
		System.out.println("the version "+version);
	}
}
class DeviceSpecs{
	public static void main(String a[]) {
		Accesories s=new Accesories();
		s.Device("Android");
		s.Device(8.1f);
		s.Device(8000);
	}
}
