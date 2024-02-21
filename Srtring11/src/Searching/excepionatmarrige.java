package Searching;
 
public class excepionatmarrige {
	
	static void submit() throws marriageException
	{
		int age=18;
		if(age>=21)
		{
			System.out.println("get redy for marrige");
		}
		else
		{
			throw new marriageException ("invalid age");
		}
	}
	public static void main(String[] args) {
		try{
			submit();
		}
		catch(marriageException e)
		{
			System.out.println(e.get());
		}
	}
	
}
class marriageException extends Exception{
	String msg;
	marriageException(String msg)
	{
		this.msg=msg;
	}
	public String get()
	{
		return msg;
	}
}
