package Searching;
import java.lang.*;
class marrigeException  extends Exception{
	String message;
	marrigeException(String messaege)
	{
		this.message=message;
	}
	public String get()
	{
		return message;
	}
}
public class exception  {
	static void submit() throws marrigeException
	{
		int age=12;
		if(age>=21)
		{
			System.out.println("get redy for marrige");
		}
		else
		{
			throw new marrigeException("invalid age");
		}
	}

	public static void main(String[] args) {
		try{
		       submit();
		}
		catch(marrigeException e)
		{
			System.out.println(e.get());
		}
	}

}
