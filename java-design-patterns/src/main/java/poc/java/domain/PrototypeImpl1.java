package poc.java.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Setter
@Getter
public class PrototypeImpl1 extends Prototype {

	private String name;
	private TestDomain td;
	

	@Override
	public PrototypeImpl1 clone() throws CloneNotSupportedException {
		return (PrototypeImpl1) super.clone();
	}

}
