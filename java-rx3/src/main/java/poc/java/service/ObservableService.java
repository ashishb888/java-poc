package poc.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import lombok.extern.slf4j.Slf4j;
import poc.java.domain.Employee;
import poc.java.repos.EmployeeRepository;

@Slf4j
@SuppressWarnings("unused")
@Service
public class ObservableService {

	@Autowired
	private EmployeeRepository er;

	private void create() {
		log.info("create service");

		Observable.create(emitter -> {
			while (!emitter.isDisposed()) {
				long time = System.currentTimeMillis();
				emitter.onNext(time);

				if (time % 2 != 0) {
					emitter.onError(new IllegalStateException("Odd millis"));
					break;
				}
			}
		}).subscribe(System.out::println, Throwable::printStackTrace);

	}

	public void main() {
		log.info("main service");

		create();
	}
}
