package numbering;

class Sample
{
	public void add()
	{
		System.out.println("Hey it is a upcasting");
	}
	
}
class Sample1 extends Sample
{
	public void red()
	{
		System.out.println("hey it is  a downcasting");
	}
}

public class typecasting {
	public static void main(String[] args) {
		Sample s1=new Sample1();
		
		Sample1 s2=(Sample1) s1;
		s2.add();
		s2.red();
		
	}

}
