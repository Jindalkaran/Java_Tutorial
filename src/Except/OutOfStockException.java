package Except;
//user defined exception using throws

public class OutOfStockException extends Exception {

	public OutOfStockException()
	{
		System.out.println("OUT OF STOCK EXCEPTION");

	}

}

class InvalidAccountException extends Exception{
	public InvalidAccountException()
	{
		System.out.println("INVALID ACOUNT NUMBER");
	}
}