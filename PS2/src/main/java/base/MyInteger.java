package base;

public class MyInteger {
	
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}
	

	public boolean isEven() {
		
		if (iValue % 2 == 0) {
			return true;
		}
		else return false;
		
	}
	
	public boolean isOdd() {
		
		if (iValue % 2 == 1) {
			return true;
		}
		else return false;
		}
	public boolean isPrime() {
		if (iValue % 2 == 0) {
			return false;
		}
		if (iValue % 3 == 0) {
			return false;
		}
		else {
			return true;
		}
			
	}
	
	public static boolean isEven(int n) {
		
		if (n % 2 == 0) {
			return true;
		}
		else return false;
		}
	public static boolean isOdd(int n) {
		
		if (n % 2 == 1) {
			return true;
		}
		else return false;
		}
	public boolean isPrime(int n) {
		if (n % 2 == 0) {
			return false;
		}
		if (n % 3 == 0) {
			return false;
		}
		else {
			return true;
		}
			
	}
}
