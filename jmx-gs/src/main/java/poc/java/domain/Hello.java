package poc.java.domain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hello implements HelloMBean {

	@Override
	public void sayHello() {
		log.info("Hello from JMX");
	}

	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public String getName() {
		return "HelloMBean";
	}

}
