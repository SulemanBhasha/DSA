package Searching;

class Watsapp
{
  public void send(int num)
  {
//	 try { int i=1/0;}
//	 catch(Exception e)
//	 {
//		 System.out.println("handle");
//	 }
	  int i=0/0;
	  System.out.println("number send");
  }
  public void send(String upi)
  {
	  System.out.println("upi id  sended");
  }
  public void send(int num,String upi)
  {
	  System.out.println("upi and number is sended");
  }
}

public class overLoading {
public static void main(String[] args) {
	Watsapp w=new Watsapp();
	w.send(776073650);
	w.send("776073650@ybl");
	w.send(776047474,"7760736550@ybl");
    System.out.println("======================main ends");
}
}
