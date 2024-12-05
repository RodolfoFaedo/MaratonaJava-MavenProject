package cf.rodolfo.JavaCore.ZA_InnerClasses;

public class OuterClassTest01 {

	private String name = "Dux Nutrition";

	class Inner {
		public void printOuterClassAttribute() {
			System.out.println(name);
			System.out.println(this); // inner reference
			System.out.println(OuterClassTest01.this); // outer reference
		}
	}

	public static void main(String[] args) {
		System.out.println("Inside outer class");
		OuterClassTest01 outerClass = new OuterClassTest01();
		Inner inner = outerClass.new Inner();
		inner.printOuterClassAttribute();

	}

}
