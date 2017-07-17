package com.zy.exception;

public class ExceptionTest {
	
	public static void main(String[] args) throws Exception {
		
		int i = 0;
		i += 15;
		
		if (i < 20) {
			//throw new MyException();
			try {
				throw new MyException();
			} catch (MyException e) {
				//throw new Exception(e);
				MyException exception = new MyException();
				exception.initCause(e);
				throw exception;
			} finally {
				//return;
			}
		}
		
		
	}
	
}
