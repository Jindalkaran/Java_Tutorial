package Except;

class account
{
	public void number(String no)
	{
		try
		{
			if(no.length()!=8)
			{
			InvalidAccountException ian=new InvalidAccountException();
			throw ian;
			}
			else
			{
				System.out.println("CONGRATS!!!!!YOUR ACCOUNT IS VALID");
			}
		}
		catch(InvalidAccountException ian) {
			ian.printStackTrace();
		}
	}
}
public class UserDefinedExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account n=new account();
		n.number("1234567");

	}

}
