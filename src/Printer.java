
public interface Printer {

	public void print();

	default void doSomething() {

		System.out.println("Testing default method");
	}

}
