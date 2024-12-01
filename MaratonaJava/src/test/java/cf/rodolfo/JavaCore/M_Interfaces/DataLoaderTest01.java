package cf.rodolfo.JavaCore.M_Interfaces;

public class DataLoaderTest01 {
	public static void main(String[] args) {
		DatabaseLoader databaseLoader = new DatabaseLoader();
		FileLoader fileLoader = new FileLoader();
		databaseLoader.load();
		fileLoader.load();
		databaseLoader.remove();
		fileLoader.remove();
		databaseLoader.checkPermission();
		DataLoader.retriveMaxDataSize();
		DatabaseLoader.retriveMaxDataSize();
		
	}

}
