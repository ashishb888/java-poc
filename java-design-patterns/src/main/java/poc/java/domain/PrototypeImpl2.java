package poc.java.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Setter
@Getter
public class PrototypeImpl2 extends Prototype {

	private String name;
	private TestDomain td;

	@Override
	public PrototypeImpl2 clone() throws CloneNotSupportedException {
		return (PrototypeImpl2) super.clone();
	}

}
