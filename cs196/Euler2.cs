using System;
namespace Euler2Problem{
	class Euler2{
		static void Main(string[] args){
			int counter = 0;
			int Prime = 0;
			int potential = 1;
			int isPrime = 0;	
			
			for (counter = 0; counter <=10001;){
				isPrime = prime_Finder(potential);
				if (isPrime == 1){
					counter = counter +1;
					Prime = potential;
					potential = potential +1;
					
				}
				else{
					potential = potential + 1;
				}
			}
			Console.WriteLine(Prime);	

		}

		static int prime_Finder(int number){
			int test;
			
			for (test = number -1; test > 1; test = test - 1){
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
