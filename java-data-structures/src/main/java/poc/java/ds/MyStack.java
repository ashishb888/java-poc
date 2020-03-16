package poc.java.ds;

import java.util.Arrays;
import java.util.NoSuchElementException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyStack<E> {
	private int top = -1;
	private int size;
	private E elements[];

	public MyStack(int size) {
		super();
		this.size = size;
		this.elements = (E[]) new Object[size];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == size - 1;
	}

	public int size() {
		return top + 1;
	}

	public void push(E element) {

		if (isFull())
			throw new IndexOutOfBoundsException("Overflow Exception");

		elements[++top] = element;
	}

	public E pop() {

		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");

		return elements[top--];
	}

	public E peek() {

		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");

		return elements[top];
	}

	public void print() {
		log.debug("stack: " + Arrays.toString(elements));
	}
}
