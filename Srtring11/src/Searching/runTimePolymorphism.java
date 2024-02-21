package Searching;

class Animal1{
	void noise()
	{
		System.out.println("noise");
	}
}
class dog1 extends Animal1
{
	void noise()
	{
		System.out.println("boew boew");
	}
}
class cat1 extends Animal1
{
	void noise()
	{
		System.out.println("meo meo");
	}
}
class snake1 extends Animal1
{
	void noise()
	{
		System.out.println("shuo shuo");
	}
}

class Simulator {
	static void anims(Animal1 a1)
	{
		a1.noise();
	}
}

public class runTimePolymorphism {
	public static void main(String[] args) {
		cat1 c=new cat1();
		dog1 d= new dog1();
		snake1 s= new snake1();
		
		Simulator.anims(c);
		Simulator.anims(d);
		Simulator.anims(s);
	}
}
