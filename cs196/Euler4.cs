using System;
namespace Euler4Application{
	class Euler4{
		static void Main(string[] args){
			int number;
			long sum = 0;

			for (number = 2; number<2000000; number = number + 1){
				if (prime_Finder(number) == 1){
					sum = sum + (long)number;
				}
				else{

				}
			}
			Console.WriteLine(sum);
				
		}

		static int prime_Finder(int number){
			long test;
			
			for (test =(long)Math.Sqrt(number); test > 1; test = test - 1){
				if(number == 3 || number == 1 || number ==2){
					return 1;
					break;
				}
				
				else if (number%test == 0){
					return 0;
					break;
				}
			}
			return 1;
			
		}
	}
}
