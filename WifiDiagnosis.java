/*
 * Class: CMSC203 CRN:22377 
 * Instructor:Gary Thai
 * Description: Wi-Fi Diagnosis
 * Due: 09/18/2022
 * Platform/compiler:Microsoft Windows11
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Zhiteng Ke
*/

import java.util.Scanner;

public class WifiDiagnosis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("If you have a problem with internet connectivity this WiFi Diagnosis might work.");
		
		int x = 1;
		if(x<2)
		{
			System.out.println("Reboot the computer and try to connect");
			System.out.println("Did that fix the problem?(Yes or No?)");
			if(lower().equals ("yes")) 
			{
				x+=1;
			}else 
				{
					System.out.println("Reboot the router and try to connect");
					System.out.println("Did that fix the problem?(Yes or No?)");
					if(lower().equals ("yes")) 
					{
						x+=1;				
					}else
						{
							System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router");
							System.out.println("Did that fix the problem?(Yes or No?)");
							if(lower().equals ("yes")) 
							{
								x+=1;				
							}else
								{
									System.out.println("Move the computer closer to the router and try to connect");
									System.out.println("Did that fix the problem?(Yes or No?)");
									if(lower().equals ("yes")) 
									{
										x+=1;				
									}else 
										{
											System.out.println("Contact vour ISP");
											System.out.println("Did that fix the problem?(Yes or No?)");
											if(lower().equals ("yes")) 
											{
												x+=1;				
											}else
												{
													System.out.println("Sorry, we can't help you:( \n--By Zhiteng Ke");
													x+=1;
												}
										}
										
								}
						}
				}
			
		}
	}
	public static String lower() {
		Scanner keyboard = new Scanner(System.in);
		String UserInput = keyboard.nextLine();
		String lower = UserInput.toLowerCase();
		if(lower.equals("yes") || lower.equals("no"))
		{
			return lower;
		}else
			{
				System.out.println("Invalid answer; try again");
				lower = "yes";
				return lower;
			}
	}

}
