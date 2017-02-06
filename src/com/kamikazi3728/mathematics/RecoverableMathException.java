package com.kamikazi3728.mathematics;

public class RecoverableMathException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public RecoverableMathException() {
        super();
    }
    public RecoverableMathException(String s) {
        super(s);
    }
    public RecoverableMathException(String s, Throwable throwable) {
        super(s, throwable);
    }
    public RecoverableMathException(Throwable throwable) {
        super(throwable);
    }
}