package poc.java.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import poc.java.ds.MyStack;

@Service
@Slf4j
public class MyStackService {

	public void main() {
		log.debug("main service");

		MyStack<Integer> myStack = new MyStack<>(5);

		log.debug("isEmpty: " + myStack.isEmpty());
		log.debug("isFull: " + myStack.isFull());
		log.debug("size: " + myStack.size());

		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.push(5);

		myStack.print();

		log.debug("isEmpty: " + myStack.isEmpty());
		log.debug("isFull: " + myStack.isFull());
		log.debug("size: " + myStack.size());

		log.debug("" + myStack.pop());
		log.debug("" + myStack.pop());
		log.debug("isEmpty: " + myStack.isEmpty());
		log.debug("isFull: " + myStack.isFull());
		log.debug("size: " + myStack.size());

		myStack.push(14);
		myStack.push(15);

		myStack.print();
	}
}
