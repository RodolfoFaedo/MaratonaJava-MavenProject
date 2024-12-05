package cf.rodolfo.JavaCore.ZA_InnerClasses;

public class OuterClassTest02 {
	private String name = "Incline bench press";

	public void print() {
		class LocalClass {
			public void printLocal() {
				System.out.println(name);
			}
		}
		LocalClass localClass = new LocalClass();
		localClass.printLocal();
	}

	public static void main(String[] args) {
		OuterClassTest02 outerClassTest02 = new OuterClassTest02();
		outerClassTest02.print();

	}



}
