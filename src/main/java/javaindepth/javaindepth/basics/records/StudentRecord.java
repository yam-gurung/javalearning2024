package javaindepth.javaindepth.basics.records;

import java.time.LocalDate;
import java.time.Month;

public record StudentRecord(long id, String name, String dept, LocalDate start, LocalDate end) {
	public static void main(String[] args) {
		StudentRecord student=new StudentRecord(1000,"yam","CS",LocalDate.of(2005, Month.JULY, 10),LocalDate.of(2009, Month.DECEMBER, 15));
		System.out.println(student);
		System.out.println(student.name());
	}
}
