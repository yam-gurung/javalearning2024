package javaindepth.javaindepth.basics.records;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
	private long id;
	private String name;
	private String dept;
	private LocalDate start;
	private LocalDate end;
	
	@Override
	public int hashCode() {
		return Objects.hash(dept, end, id, name, start);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(dept, other.dept) && Objects.equals(end, other.end) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(start, other.start);
	}

	public Student(long id, String name, String dept, LocalDate start, LocalDate end) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", start=" + start + ", end=" + end + "]";
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public LocalDate getStart() {
		return start;
	}

	public LocalDate getEnd() {
		return end;
	}
	
}
