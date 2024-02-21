package Searching;

interface animal{
	void noise ();
}
class cat implements animal{
	public void noise()
	{
		System.out.println("meo meo");
	}
}
class dog implements animal{
	public void noise()
	{
		System.out.println("bow bow");
	}
}

class snake implements animal{
	public void noise()
	{
		System.out.println("shuu shuu");
	}
}

class simulator{
	public static  void anims(animal a1)
	{
		a1.noise();
	}
}



public class Abstarction {
	public static void main(String[] args) {
		cat c=new cat();
		dog d=new dog();
		snake s=new snake();
	simulator.anims(c);
	simulator.anims(d);
	simulator.anims(s);
		
	}

}
