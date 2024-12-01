package cf.rodolfo.JavaCore.O_Exception.error;

public class StackOverFlowTest01 {
	public static void main(String[] args) {
		recursion();
	}

	public static void recursion() {
		recursion();
	}
}
