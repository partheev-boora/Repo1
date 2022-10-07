package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Date {
public static  void main(String args[]) {
	LocalDate date=LocalDate.now();
	System.out.println("current date is"+date);
	//LocalTime time=LocalTime.now();
	System.out.println("current time"+LocalTime.now());
	LocalDateTime current=LocalDateTime.now();
	System.out.println("current date and time "+current);
	DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String formattedDateTime=current.format(format);
	System.out.println(formattedDateTime);
	Month month=current.getMonth();
	int day=current.getDayOfMonth();
	int seconds=current.getSecond();
	int hour=current.getHour();
	int year=current.getYear();
	System.out.println("Month: "+month+" day "+day+" seconds "+seconds+" hour "+hour+" year "+year);
	LocalDate date2=LocalDate.of(1950, 1, 26);
	System.out.println("the republic day"+date2);
	System.out.println(date2.getDayOfWeek());
	System.out.println("Specific date with current time"+current.withDayOfMonth(24).withYear(2016));
}
}
