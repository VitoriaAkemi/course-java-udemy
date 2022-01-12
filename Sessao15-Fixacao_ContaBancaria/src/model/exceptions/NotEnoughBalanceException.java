package model.exceptions;

public class NotEnoughBalanceException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public NotEnoughBalanceException(String msg) {
		super(msg);
	}

}
