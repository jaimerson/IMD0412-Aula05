package br.ufrn.imd.password;

public class PasswordChecker implements IPasswordChecker {
	
	@Override
	public Boolean isStrong(String password){
		return hasMinimunLength(password);
	}
	
	private static int MINIMUN_LENGTH = 8;
	
	private Boolean hasMinimunLength(String password){
		return password.length() >= MINIMUN_LENGTH;
	}

}
