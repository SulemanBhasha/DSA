package patterns;

public class k {
public static void main(String[] args) {
	for (int i = 6; i >1; i--) {
		for (int j = 1; j <6; j++) {
			if (i>j) {
				System.out.print("*");
				
			} else {
				System.out.print(" ");

			}
			
		}
		System.out.println();
		
	}
	
	for (int i = 2; i<6; i++) {
		for (int j = 1; j<=i; j++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
	
}
}
