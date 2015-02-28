
public class Project5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 20;
		int number = 1;
		int answer = 0;
		
		while (i > 0){
			if (number % i == 0){
				answer = number;
				i = i - 1;
			}
			else {
				number = number + 1;
				i = 20; 
				
			}
			
		}
		System.out.println (answer);
	}

}
