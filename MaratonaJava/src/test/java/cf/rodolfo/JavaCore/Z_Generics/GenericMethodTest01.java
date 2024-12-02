package cf.rodolfo.JavaCore.Z_Generics;

import java.util.List;

import cf.rodolfo.JavaCore.Z_Generics.domain.Boat;

public class GenericMethodTest01 {
	public static void main(String[] args) {
//		createArrayWithObject(new Boat("Poseidon"));
		List<Boat> boatList = createArrayWithObject(new Boat("Poseidon"));
		System.out.println(boatList);
	}

//	private static <T> void createArrayWithObject(T t) {
//		List<T> list = List.of(t);
//		System.out.println(list);
//	}

	private static <T> List<T> createArrayWithObject(T t) {
		return List.of(t);
		
	}

}
