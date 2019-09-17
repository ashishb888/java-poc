package poc.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;
import lombok.extern.slf4j.Slf4j;
import poc.java.domain.Employee;
import poc.java.repos.EmployeeRepository;

@Slf4j
@SuppressWarnings("unused")
@Service
public class SchedulersService {

	@Autowired
	private EmployeeRepository er;

	private void fromCallable() {
		log.info("fromCallable service");

		Flowable.fromCallable(() -> {
			Thread.sleep(1000);
			return "Done";
		}).subscribeOn(Schedulers.io()).observeOn(Schedulers.single()).subscribe(System.out::println,
				Throwable::printStackTrace);

		try {
			Thread.sleep(2000); //Waiting on above task
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void main() {
		log.info("main service");

		fromCallable();
	}
}
