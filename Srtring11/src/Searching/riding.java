package Searching;

class watsapp{
	void  send()
	{
		System.out.println("messege and image");
	}
}

class Watsapp2 extends watsapp
{
	void send()
	{
		System.out.println("new update to post stories");
		super.send();
	}
	
	
}

public class riding {
public static void main(String[] args) {
	Watsapp2 w=new Watsapp2();
	w.send();
}
}
