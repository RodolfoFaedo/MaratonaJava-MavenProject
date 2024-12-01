package cf.rodolfo.JavaCore.O_Exception.execption;

import java.io.Closeable;
import java.io.IOException;

public class Reader1 implements Closeable {

	@Override
	public void close() throws IOException {
		System.out.println("Closing Reader 1");
	}

}
