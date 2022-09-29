/*
 * Class: CMSC203 CRN:22377 
 * Instructor:Gary Thai
 * Description: Random Number Guesser
 * Due: 10/01/2022
 * Platform/compiler:Microsoft Windows11
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Zhiteng Ke
*/


import java.util.Scanner;


public class RandomNumberGuesser 
{
	public static void main(String[] args)
	{
		System.out.println("This application generates a random integer between 1 and 100\r\n"
				+ "  and asks the user to guess repeatedly until they guess correctly.");
		
		System.out.println("Enter your first guess: ");
		Scanner kb = new Scanner(System.in);
		int guess=kb.nextInt(), max=100,min=1;
		Compare(guess,min,max);
		
	}
	public static void Compare(int guess,int min,int max)
	{
		Scanner kb= new Scanner(System.in);
		int Rand=RNG.rand();
		while(RNG.getCount()<7) 
		{
			if(guess == Rand)
				{
					System.out.println("Congratulations, you guessed correctly");
					System.out.println("Try again? (yes or no)");
					String str= kb.nextLine();
					if(str.equals("no"))
						{
							System.out.println("Thanks for playing...");
							System.out.println("Programmer name: Zhiteng Ke");
							break;
						}
					else if(str.equals("yes")) 
					{
						RNG.resetCount();
						min=1;
						max=100;
						RandomNumberGuesser.main(null);
						break;
					}
				}
			else if(guess>Rand)
				{
					if(!RNG.inputValidation(guess, min, max))
					{
						guess= kb.nextInt();
						Compare(guess,min,max);
					}
					else
					{
						System.out.println("Your guess is too high\n"
								+ "Number of guesses is: "+ RNG.getCount());
						System.out.printf("Enter your next guess between %d and %d\n",min,guess);
						max=guess;
						guess=kb.nextInt();
					}
					
				}
			else if(guess<Rand) 
				{
					if(!RNG.inputValidation(guess, min, max))
					{
						guess= kb.nextInt();
						Compare(guess,min,max);
					}
					else
					{
						System.out.println("Your guess is too low\n"
								+ "Number of guesses is: "+ RNG.getCount());
						System.out.printf("Enter your next guess between %d and %d\n",guess,max);
						min=guess;
						guess=kb.nextInt();
					}
					
				}
			if(RNG.getCount()==7)
				System.out.println("You have exceeded the maximum number of guesses, 7. Try again.");
		}
		
	}
}
