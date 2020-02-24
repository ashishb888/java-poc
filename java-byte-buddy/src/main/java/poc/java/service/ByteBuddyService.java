package poc.java.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.matcher.ElementMatchers;
import poc.java.domain.HelloWorld;

/**
 * @author ashishb888
 */

@Slf4j
@Service
public class ByteBuddyService {

	private void fixedValue() throws InstantiationException, IllegalAccessException {
		log.debug("fixedValue service");

		Class<?> dynamicType = new ByteBuddy().subclass(Object.class).method(ElementMatchers.named("toString"))
				.intercept(FixedValue.value("Hello World!")).make()
				.load(this.getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER).getLoaded();

		log.debug("dynamicType: " + dynamicType);
		log.debug("dynamicType: " + dynamicType.newInstance());
	}

	private void methodDelegation() throws InstantiationException, IllegalAccessException {
		log.debug("methodDelegation service");

		Class<?> dynamicType = new ByteBuddy().subclass(Object.class).method(ElementMatchers.named("toString"))
				.intercept(MethodDelegation.to(HelloWorld.class)).make()
				.load(this.getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER).getLoaded();

		log.debug("dynamicType: " + dynamicType);
		log.debug("dynamicType: " + dynamicType.newInstance());
	}

	public void main() {
		log.debug("main service");

		try {
			// fixedValue();
			methodDelegation();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
