package cf.rodolfo.JavaCore.U_Regex.test;

public class ScannerTest01 {
	public static void main(String[] args) {
		String text = "Boeing, Airbus, Embraer, true, 200";
		String[] names = text.split(",");
		for (String name : names) {
			System.out.println(name.trim());
		}
	}

}
