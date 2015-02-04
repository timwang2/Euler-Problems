
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 1;
		int counter2 = 1;
		int sum = 0;
		
		// All multiples of 3 under 1000
		while (counter * 3 < 1000){
			sum = sum + (counter*3);
			counter = counter + 1;	
		}
		
		
		//All multiples of 5 under 1000 excluding 3's
		
		while (counter2 * 5 < 1000){
			if (counter2 % 3 != 0) {
				sum = sum + (counter2 * 5);
				counter2 = counter2 + 1;
			}
			
			else {
				counter2 = counter2 +1;
			}
		}
		
		System.out.println (sum);
	}

}
