package cf.rodolfo.JavaCore.O_Exception.runtime;

public class RunTimeExceptionTest02 {

	public static void main(String[] args) {
		division(1, 0);
	}

	/**
	 * @param n1
	 * @param n2 cannot be zero
	 * @return
	 * @throws IllegalArgumentException in case n2 is zero
	 */
	
	private static int division(int n1, int n2) {
		if (n2 == 0) {
			throw new IllegalArgumentException("Second argument is invalid! Cannot be zero!");

		}
		int result = n1 / n2;
		return result;

	}

}
