package cf.rodolfo.JavaCore.P_Wrappers;

public class WrapperTest01 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte primitiveByte = 1;
		short primitiveShort = 1;
		int primitiveInt = 1;
		long primitiveLong = 10L;
		float primitiveFloat = 10F;
		double primitiveDouble = 10;
		char primitiveChar = 'A';
		boolean primitiveBoolean = true;
		
		Byte wrapperByte = 1;
		Short wrapperShort = 1;
		Integer wrapperInt = 1; // autoboxing
		Long wrapperLong = 10L;
		Float wrapperFloat = 10F;
		Double wrapperDouble = 10.3;
		Character wrapperChar = 'A';
		Boolean wrapperBoolean = true;
		
		int i = wrapperInt; // unboxing
	}	
}
