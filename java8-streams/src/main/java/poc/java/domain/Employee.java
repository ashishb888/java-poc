package poc.java.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author ashishb888
 */

//@Setter
//@Getter
//@NoArgsConstructor
//@ToString
//@EqualsAndHashCode
public class Employee {
	private String name;
	private int age;
	private double salary;
	private String department;
	private Gender gender;

	public Employee() {
		super();
	}

	public Employee(String name, int age, double salary, String department, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", department=" + department
				+ ", gender=" + gender + "]";
	}

}
