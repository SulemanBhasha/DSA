package Array;

public class poeroffour {
	 public static void main(String[] args) {
		int n = 256;
		boolean flag = false;
		for (int i = 1; i <=n; i++) {
			int num = (int) Math.pow(i, 4);
			if(num==n){
				System.out.println("it is power of four");
				flag= true;
				break;
			}
			
		}
		if(flag==false){
			System.out.println("no it it is not a poer ");
		}
	}
}
