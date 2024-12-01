package cf.rodolfo.JavaCore.O_Exception.execption;

public class InvalidLoginException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidLoginException() {
		super("Invalid Login");
	}

	public InvalidLoginException(String massage) {
		super(massage);
	}

}
