package cf.rodolfo.JavaCore.O_Exception.execption;

import java.util.Scanner;

public class InvalidLoginTest01 {
	public static void main(String[] args) {
		try {
			logon();
		} catch (InvalidLoginException e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("resource")
	private static void logon() throws InvalidLoginException {
		Scanner scan = new Scanner(System.in);
		String usernameDB = "Goku";
		String passwordDB = "ssj";

		System.out.println("Username: ");
		String usernameScan = scan.nextLine();
		System.out.println("Password: ");
		String passwordScan = scan.nextLine();
		if (!usernameDB.equals(usernameScan) || !passwordDB.equals(passwordScan)) {
			throw new InvalidLoginException("Invalid username or password!");

		} else {
			System.out.println("\nWelcome!");
		}
		scan.close();

	}
}
