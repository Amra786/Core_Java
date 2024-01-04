package java8;

import java.time.LocalDate;
import java.time.Period;

public class Test13 {

	public static void main(String[] args) {
		LocalDate birthday=LocalDate.of(1989,8,28);
		LocalDate today=LocalDate.now();
		Period p=Period.between(birthday,today);
		System.out.printf("Age is%d  Years %d Months %d Days",p.getYears(),p.getMonths(),p.getDays());
	}

}
