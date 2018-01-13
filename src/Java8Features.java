import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8Features {

	static List<Integer> strings = new ArrayList<Integer>();
	
	public static void main(String argts[]) {
		
		strings.add(1);
		strings.add(2);
		strings.add(3);
		strings.add(4);
		strings.add(4);
		strings.add(6);
		strings.add(7);
		strings.add(8);
		
		Set<Integer> setData = strings.parallelStream().collect(Collectors.toSet());
		
		System.out.println("using streams "+setData);
		
		
		Printer p = () -> System.out.println("Hello i am lambda");

		p.doSomething();


		testingFunctionPassing(() -> {System.out.println("Hello I am runnable");});
		
	}

	public static void testingFunctionPassing(Runnable p) {

		Thread t = new Thread(p);
		
		t.start();
	}

}
