
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int Fib = 1;
		int Fib2 = 1;
		
		while (Fib2 + Fib < 4000000){
		//Fib sequence	
			Fib = Fib + Fib2;
			Fib2 = Fib - Fib2;
			// adding the evens
			if (Fib % 2 == 0){
				sum = sum + Fib;
			}
			// dodgin the other ones
			else{
			}
		}
	System.out.println (sum);
	}

}
