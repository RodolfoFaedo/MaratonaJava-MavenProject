package cf.rodolfo.JavaCore.ZA_InnerClasses;

public class OuterClassesTest01 {
	private String name = "Dux Nutrition";

	class Inner {
		public void printOuterClassAttribute() {
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		OuterClassesTest01 outerClass = new OuterClassesTest01();
		Inner inner = outerClass.new Inner();
		inner.printOuterClassAttribute();
	}
}
