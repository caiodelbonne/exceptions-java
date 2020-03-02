package model.exceptions;

public class DomainException extends Exception{
	private static final long serialVersionUID = 1L;
// rumTimeException o copilador nao obriga a tratar o erro 
	
	public DomainException (String msg) {
		super (msg);
	}
}
