package cf.rodolfo.JavaCore.R_Dates;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
	public static void main(String[] args) {
		Instant instantNow = Instant.now();
		System.out.println(instantNow);
		System.out.println(LocalDateTime.now());
		System.out.println(instantNow.getNano());
		System.out.println(instantNow.getEpochSecond());
		System.out.println(Instant.ofEpochSecond(3));
		System.out.println(Instant.ofEpochSecond(3, 0));
		System.out.println(Instant.ofEpochSecond(3, 1));
		System.out.println(Instant.ofEpochSecond(3, 1000000000));
		System.out.println(Instant.ofEpochSecond(3, -1000000000));

	}

}
