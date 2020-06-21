package exceptions;

import javax.activity.InvalidActivityException;

public class IfElseCheckedException {
	public static void main(String[] args) {
		IfElseCheckedException iece = new IfElseCheckedException();
		iece.go();
	}
	
	private void go() {
		
	}
	
	private String goAgain(int x) throws InvalidActivityException {
		if (x % 2 == 0) {
			return "Even";
		} else {
			throw new InvalidActivityException();
		}
	}
}	
