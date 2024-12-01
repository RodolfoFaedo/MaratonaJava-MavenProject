package cf.rodolfo.JavaCore.G_Association;

public class HeritageTest02 {
	/*
	 * 0 = the superclass's static inicialization block is executed when the parent class is loaded by JVM;
	 * 1 = the subclass's static inicialization block is executed when the child class is loaded by JVM;
	 * 2 = memory space is allocated for the object of superclass;
	 * 3 = each superclass attribute is created and inicialized with default values or whatever is passed; 
	 * 4 = the superclass's inicialization block is executed in the order in which they appear;
	 * 5 = the constructor is executed;
	 * 6 = memory space is allocated for the object of subclass;
	 * 7 = each subclass attribute is created and inicialized with default values or whatever is passed; 
	 * 8 = the subclass's inicialization block is executed in the order in which they appear;
	 * 9 = the subclass constructor is executed;
	*/
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Employee employee = new Employee("Jaya");
	
	}
}
