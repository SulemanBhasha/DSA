package Searching;

class Sample {
	private String  pass="dummypass";
	public String get()
	{
		return pass;
	}
	public void set(String pass)
	{
		this.pass=pass;
	}
}
class encapsulation{
	public static void main(String[] args) {
		Sample e1=new Sample();
//		System.out.println(e1.get());
		e1.set("Anfal@123");
		System.out.println(e1.get());
	}
}
