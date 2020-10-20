package poc.java.service;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;

@BenchmarkMode({ Mode.AverageTime, Mode.Throughput })
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 3, time = 5)
@Measurement(iterations = 5, time = 10)
@Threads(1)
//@Fork(1)
@State(Scope.Benchmark)
public class StringVsBytesComparison {

	byte[] ba1 = "Hello".getBytes();
	byte[] ba2 = "Hello".getBytes();

	@Benchmark
	public boolean stringComparison() {
		String s1 = new String(ba1);
		String s2 = new String(ba2);

		return s1.equals(s2);
	}

	@Benchmark
	public boolean bytesComparison() {
		String s1 = "Hello";
		String s2 = "Hello";
		byte[] ba1 = s1.getBytes();
		byte[] ba2 = s2.getBytes();

		return Arrays.equals(ba1, ba2);
	}

}
