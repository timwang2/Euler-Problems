
public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Target = 600851475143.0;
		int Divisor = 2;
		int Answer = 0;
		
		while (Answer < Target){
		if (Target % Divisor == 0){
			Target = Target/Divisor;
			Answer = Divisor;}
		
		
		if (Target % Divisor != 0){
			Divisor = Divisor + 1;
		}
		
	}
		System.out.println(Answer);

	}}
