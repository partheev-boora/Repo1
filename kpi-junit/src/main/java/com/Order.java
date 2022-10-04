package com;

import java.util.Date;
import java.util.Random;

public class Order {
	int OrderId;
	String SecurityCode;
	String OrderStatus;
	Date d=new Date();
	void setOrderDate(Date date) {
		// TODO Auto-generated method stub
		d=date;
	}

	void setOrderStatus(String string) {
		// TODO Auto-generated method stub
		OrderStatus=string;
	}

	void setSecurityCode(String string) {
		// TODO Auto-generated method stub
		SecurityCode=string;
	}

	void setOrderId(int n) {
		// TODO Auto-generated method stub
		OrderId=n;
	}

}
class Ord{
public static Order createOrder(Order order) {
	Order newOrder = new Order();
    newOrder.setOrderId(new Random().nextInt());
    newOrder.setSecurityCode("XYZ");
    newOrder.setOrderStatus("INITIATED");
    newOrder.setOrderDate(new Date());
    //orderDao.createOrder(newOrder);
    return newOrder;
}
public static void main(String args[]) {
	Order o=new Order();
}
}