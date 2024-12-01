package cf.rodolfo.JavaCore.O_Exception.runtime;

public class RunTimeExceptionTest03 {
	public static void main(String[] args) {
		openConection();
		System.out.println("\n");
		openConection2();

	}

	private static String openConection() {
		try {
			System.out.println("Opening file");
			System.out.println("Writing data to file");
			return "Conection successfully opened";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Closing resource realesed by the OS");
		}
		return "Conection ERROR!";
	}

	private static void openConection2() {
		try {
			System.out.println("Opening file");
			System.out.println("Writing data to file");
			throw new RuntimeException();
		} finally {
			System.out.println("Closing resource realesed by the OS");
		}
	}
}
