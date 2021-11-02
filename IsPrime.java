import java.util.*;

public class IsPrime {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = scn.nextInt();
			
			int div = 2;
		      while(div * div <= n) {
				if(n % div == 0) {
					
					break;
				}
				div++;
			}
			if(div * div > n) {
				System.out.println("Prime");
			} else {
				System.out.println("Not Prime");
			}
		}
	}

}
