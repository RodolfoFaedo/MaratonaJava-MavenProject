package cf.rodolfo.JavaCore.O_Exception.runtime;

import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
	public static void main(String[] args) {
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside of ArrayIndexOutOfBoundsException | IndexOutOfBoundsException");
		} catch (IllegalArgumentException e) {
			System.out.println("Inside of IllegalArgumentException");
		} catch (ArithmeticException e) {
			System.out.println("Inside of ArithmeticException");
		}

		try {
			maybeThrowException();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			maybeThrowException();
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}

	}

	private static void maybeThrowException() throws SQLException, IOException {

	}
}
