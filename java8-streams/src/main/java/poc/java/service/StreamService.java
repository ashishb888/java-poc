package poc.java.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poc.java.domain.Employee;
import poc.java.repos.StreamsRepository;

/**
 * @author ashishb888
 */

@Service
@SuppressWarnings(value = "unused")
public class StreamService {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private StreamsRepository streamsRepository;
	@Autowired
	private FunctionalService functionalService;
	@Autowired
	private PSStreamService psService;
	@Autowired
	private ComparatorService cs;
	@Autowired
	private GroupingByService gs;
	@Autowired
	private JoiningService js;
	@Autowired
	private SummarizingService ss;
	@Autowired
	private ExampleService es;

	private void m1() {
		logger.info("m1 service");

		List<Employee> employees = streamsRepository.getAll(5);
		employees.stream().forEach(System.out::println);

		List<Employee> ageGreater30 = employees.stream().filter(e -> e.getAge() > 30).collect(Collectors.toList());
		logger.info("ageGreater30: " + ageGreater30);

	}

	public void main() {
		logger.info(this.getClass().getName() + ": main service");

		// m1();
		// functionalService.main();
		// psService.main();
		// cs.main();
		// gs.main();
		// js.main();
		// ss.main();
		es.main();
	}
}
