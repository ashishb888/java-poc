package poc.java.domain;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ThreadFactoryImpl implements ThreadFactory {
	private int priority;
	private ThreadGroup threadGroup;
	private String prefix;
	private AtomicInteger count = new AtomicInteger(1);

	@Override
	public Thread newThread(Runnable task) {
		Thread t = new Thread(this.threadGroup, task, prefix + count.getAndIncrement());
		t.setPriority(this.priority);

		return t;
	}

	public ThreadFactoryImpl(int priority, ThreadGroup threadGroup, String prefix) {
		super();
		this.priority = priority;
		this.threadGroup = threadGroup;
		this.prefix = prefix;
	}

}
