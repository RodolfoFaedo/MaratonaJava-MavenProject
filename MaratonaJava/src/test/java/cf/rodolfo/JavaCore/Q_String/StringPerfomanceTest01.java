package cf.rodolfo.JavaCore.Q_String;

public class StringPerfomanceTest01 {
	public static void main(String[] args) {
		System.out.println("Normal String");
		long start = System.currentTimeMillis();
		stringConcat(10000);
		long finish = System.currentTimeMillis();
		long executionTime = finish - start;
		System.out.printf("Execution time: %d ms%n%n", executionTime);
		
		System.out.println("String Builder");
		start = System.currentTimeMillis();
		stringBuilderConcat(10000);
		finish = System.currentTimeMillis();
		executionTime = finish - start;
		System.out.printf("Execution time: %d ms%n%n", executionTime);
		
		System.out.println("String Buffer");
		start = System.currentTimeMillis();
		stringBufferConcat(10000);
		finish = System.currentTimeMillis();
		executionTime = finish - start;
		System.out.printf("Execution time: %d ms%n", executionTime);
	}

	@SuppressWarnings("unused")
	public static void stringConcat(int size) {
		String text = "";
		for (int i = 0; i < size; i++) {
			text += 1; // 0, 01, 012, 0123, ...
		}
	}
	
	public static void stringBuilderConcat(int size) {
		StringBuilder stringBuilder = new StringBuilder(size);
		for (int i = 0; i < size; i++) {
			stringBuilder.append(i); // 0, 01, 012, 0123, ...
		}
	}
	
	public static void stringBufferConcat(int size) {
		StringBuffer stringBuilder = new StringBuffer(size);
		for (int i = 0; i < size; i++) {
			stringBuilder.append(i); // 0, 01, 012, 0123, ...
		}
	}
	
	
	
	
	
	
	
	
	
}
