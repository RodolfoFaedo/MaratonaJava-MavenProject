package cf.rodolfo.JavaCore.W_NIO.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
	public static void main(String[] args) {
		Path fileZip = Paths.get("Folder/file.zip");
		Path filesToZip = Paths.get("Folder/sub_folder1/sub_sub_folder1");
		toZip(fileZip, filesToZip);
	}

	private static void toZip(Path fileZip, Path filesToZip) {
		try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(fileZip));
			DirectoryStream<Path> directoryStream = Files.newDirectoryStream(filesToZip)) {
			for (Path file : directoryStream) {
				ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
				zipOutputStream.putNextEntry(zipEntry);
				Files.copy(file, zipOutputStream);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		;
	}
}
