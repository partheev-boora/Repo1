package com;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Chrono{

	public static void checkingChronoEnum() {
		LocalDate date = LocalDate.now();
		System.out.println("current date is:"+ date); 
		
		LocalDate year = date.plus(2, ChronoUnit.YEARS);
		System.out.println("next to next year is "+year);
		
		LocalDate nextMonth = date.plus(1, ChronoUnit.MONTHS);
		System.out.println("the next month is "+nextMonth);
		
		LocalDate nextWeek = date.plus(1, ChronoUnit.WEEKS);
		System.out.println("the next week is "+nextWeek);
		
		LocalDate Decade = date.plus(2, ChronoUnit.DECADES);
		
		System.out.println("20 years after today "+ Decade);
		
	}
	public static void main(String[] args) {
		checkingChronoEnum();
	}
}
