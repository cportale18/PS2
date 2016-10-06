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
	
	
	public boolean isEven1(int n) {
		
		if (n % 2 == 0) {
			return true;
		}
		else return false;
		}
	public boolean isOdd1(int n) {
		
		if (n % 2 == 1) {
			return true;
		}
		else return false;
		}

	public static boolean isEven(int MyInteger) {
		
		if (MyInteger % 2 == 0) {
			return true;
		}
		else return false;
		}
	public static boolean isOdd(int MyInteger) {
		
		if (MyInteger % 2 == 1) {
			return true;
		}
		else return false;
		}
	}
}