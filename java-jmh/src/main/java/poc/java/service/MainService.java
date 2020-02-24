package poc.java.service;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class MainService {

	public static void main(String... args) throws RunnerException {
		Options opt = new OptionsBuilder().include(States.class.getSimpleName()).forks(1).build();

		new Runner(opt).run();
	}
}
