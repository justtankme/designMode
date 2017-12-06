package designMode.exception;

import org.junit.Test;

import com.tank.designMode.exception.SomeException;
import com.tank.designMode.exception.ThrowsException;

public class ExceptionTest {
	@Test
	public void throwExceptionTest(){
		ThrowsException clazz = new ThrowsException();
		try {
			clazz.throwSomeException();
		} catch (SomeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clazz.throwSomeRunTimeExceptio();
		clazz.throwError();
	}
}
