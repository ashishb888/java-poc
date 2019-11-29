package poc.java.exception;

import java.lang.Thread.UncaughtExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UncaughtExceptionHandlerImpl implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		log.error(e.getMessage(), e);
		log.debug("Thread state: " + t.getState());
	}

}
