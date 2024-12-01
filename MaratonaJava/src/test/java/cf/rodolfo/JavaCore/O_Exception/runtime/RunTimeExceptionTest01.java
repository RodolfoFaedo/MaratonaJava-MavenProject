package cf.rodolfo.JavaCore.O_Exception.runtime;

public class RunTimeExceptionTest01 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		/*
		 	CHECKED Exceptions = if not handleed, this exceptions will throws a error at compile time; are those you are 
		 	required to handle, either with a try-catch block or with a throws (rethrowing it to another location); they
		 	 are used for recoverable errors
		 	
		 	UNCHECKED Exceptions = It is not mandatory to handle it; you can handle it only if you want to, 
		 	if you feel it is necessary for the good functioning of your application; used for unrecoverable errors.
		*/
		
		Object object = null;
		System.out.println(object.hashCode());
		
		
	}

}
