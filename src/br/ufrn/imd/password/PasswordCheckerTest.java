package br.ufrn.imd.password;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordCheckerTest {
	
	PasswordChecker checker;
	
	protected void setUp(){
		checker = new PasswordChecker();
	}

	@Test(expected=NullPointerException.class)
	public void testThrowsExceptionWhenNull() {
		checker.isStrong(null);
	}
	
	@Test
	public void testIsStrongWhenHasMinimunLength(){
		assertTrue(checker.isStrong("abc!12345"));
	}

}
