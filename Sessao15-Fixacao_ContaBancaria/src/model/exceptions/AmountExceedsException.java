package model.exceptions;

public class AmountExceedsException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public AmountExceedsException(String msg) {
		super(msg);
	}

}
