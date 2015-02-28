using System;
namespace Euler1App{
	class Euler1{
		static void Main(string[] args){
			int counter;
			int Sum_Squares = 0;
			int counter2 ;
			int Sqare_sum = 0;
			int Sum = 0;

			for(counter = 1; counter<101; counter = counter+1){
				Sum_Squares = Sum_Squares + (counter*counter);
			}
			
			for(counter2 = 1; counter2<101; counter2 = counter2 + 1){
				Sum = Sum + counter2;
				Sqare_sum = Sum*Sum;
			}
			
			Console.WriteLine(Sqare_sum - Sum_Squares);
		}
	}
}		
