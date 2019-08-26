package poc.java.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.ToString;

/**
 * @author ashishb888
 */

@Builder(access = AccessLevel.PUBLIC)
@ToString
public class Employee {
	private String name;
	private int age;
	private double salary;
	private String department;
	private Gender gender;
}
