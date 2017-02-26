package base;

public class MyInteger {
	
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}
	public int getiValue() 
	{
		return iValue;
	}
	public void setiValue(int iValue) 
	{
		this.iValue = iValue;
	}
	
	
	
	//Retrun true when iValue is even, odd, or prime.
	public boolean isEven()
	{
		if ((this.iValue % 2) == 0){
		return true;
		}
			return false;
	}
	public boolean isOdd()
	{
		if ((iValue % 2) != 0){
		return true;
	} 
			return false;
	}
	public boolean isPrime()
	{
		for (int i = 2; i < iValue; i++) {
			if ((iValue % i) != 0) {
				return true;
			}
		}
				return false;
	}
	
	
	
	
	//Return true when an int num is even, odd, or prime.
	public static boolean isEven(int num) 
	{
		if((num % 2) == 0) {
		    return true; 
		}
	return false;
	}

	public static boolean isOdd(int num) 
	{
		if ((num % 2) != 0){
			return true;
		}
			return false;
	}
	public static boolean isPrime(int num)
	{
		for (int i=2; i<=num; i++){
			if ((num % i) != 0)
				return true;
		}
		return false;
	}
	
	
	
	
	//check objects
	public static boolean isEven(MyInteger number)
	{
		if((number.iValue % 2) == 0) {
			return true;
	}
		return false;
	}
	public static boolean isOdd(MyInteger number)
	{
		if ((number.iValue % 2) != 2) {
			return true;
	}
		return false;
	}
	public static boolean isPrime(MyInteger number)
	{
		for (int i=2; i<=number.iValue; i++){
			if ((number.iValue % i) != 0)
				return true;
		}
		return false;
	}
	
	
	
	//check MyInteger
	public boolean equals(int a)
	{
		if (a == iValue) {
			return true;
		}
			return false;
	}
	
	public boolean equals(MyInteger b)
	{
		if(b.iValue == this.iValue){
			return true;
		}
			return false;
	}
}
