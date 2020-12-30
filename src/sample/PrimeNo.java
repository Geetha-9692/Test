package sample;

public class PrimeNo {

	public static void main(String[] args) {
		
		int temp=0;
		int no = 444;
		for(int i=2;i<=no/2;i++) {
			
			temp = no%2;
			
		}
		if(temp ==0) {
			System.out.println(no + "number is prime");
		}else {
			System.out.println(no + "number is not prime");
		}
		
	}
}
