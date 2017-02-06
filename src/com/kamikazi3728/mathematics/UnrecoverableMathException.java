package com.kamikazi3728.mathematics;

public class UnrecoverableMathException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public UnrecoverableMathException() {
        super();
    }
    public UnrecoverableMathException(String s) {
        super(s);
    }
    public UnrecoverableMathException(String s, Throwable throwable) {
        super(s, throwable);
    }
    public UnrecoverableMathException(Throwable throwable) {
        super(throwable);
    }
}
