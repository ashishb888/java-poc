package poc.java.agent;

import com.sun.tools.attach.VirtualMachine;

public class DynamicAgent {
	public static void main(String... args) throws Exception {
		VirtualMachine vm = VirtualMachine.attach(args[0]);
		try {
			vm.loadAgent(args[1], args[2]);
		} finally {
			vm.detach();
		}
	}
}
