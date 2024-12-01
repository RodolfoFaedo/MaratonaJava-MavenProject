package cf.rodolfo.JavaCore.M_Interfaces;

public interface DataLoader {
	// all methods are PUBLICS
	public static final int MAX_DATA_SIZE = 10;
	void load();
	default void checkPermission() {
		System.out.println("Checking permission");
	}
	
	public static void retriveMaxDataSize() {
		System.out.printf("Maximum data size on data loader: %d%n", MAX_DATA_SIZE);
	}
}
