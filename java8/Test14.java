package java8;

import java.time.LocalDate;
import java.time.Period;

public class Test14 {

	public static void main(String[] args) {
		LocalDate birthday=LocalDate.of(1989,8,28);
		LocalDate today=LocalDate.now();
		Period p=Period.between(birthday,today);
		System.out.printf("Age is %d Years %d Months %d Days",p.getYears(),p.getMonths(),p.getDays());
		
		LocalDate deathday=LocalDate.of(1989+60,06,15);
		Period p1=Period.between(today,deathday);
		int d=p1.getYears()*365+p1.getMonths()*30+p1.getDays();
		System.out.printf("\nYou will be on the earth only %dDays..Hurry up to do More Important Things",d);
	}

}
