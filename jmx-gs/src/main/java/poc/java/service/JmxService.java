package poc.java.service;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import poc.java.domain.Hello;

/**
 * @author ashishb888
 */

@Service
@Slf4j
public class JmxService {

	private void start() throws Exception {
		log.debug("start service");

		MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
		ObjectName name;

		name = new ObjectName("poc.java.domain:type=Hello");
		Hello mbean = new Hello();
		mbs.registerMBean(mbean, name);

		while (true) {
			Thread.sleep(30000);
		}
	}

	public void main() {
		log.debug("main service");

		try {
			start();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}
}
