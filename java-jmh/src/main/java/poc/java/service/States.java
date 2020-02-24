package poc.java.service;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

public class States {

	@State(Scope.Benchmark)
	public static class BenchmarkState {
		volatile double x = Math.PI;
	}

	@State(Scope.Thread)
	public static class ThreadState {
		volatile double x = Math.PI;
	}

	@Benchmark
	public void measureUnshared(ThreadState state) {
		state.x++;
	}

	@Benchmark
	public void measureShared(BenchmarkState state) {
		state.x++;
	}
}