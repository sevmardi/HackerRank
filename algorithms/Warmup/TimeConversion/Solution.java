package TimeConversion;

import java.util.Scanner;

/*
 * Objective: You are given time in AM/PM format. Convert this into a 24 hour format.
 * Note:  Midnight is 12:00:00AM or 00:00:00 and 12 Noon is 12:00:00.
 */
public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String time =  input.nextLine();
		String twenty_four = "";
		String[] arr = time.split(":");
		char am_om = arr[2].charAt(2);
		
		if(am_om == 'a' || am_om == 'A')
		{
			if(arr[0].equals("12"))
			{
				String am12 = "00";
				am12 += ":" + arr[1] + ":" +arr[2].charAt(0) + arr[2].charAt(1);
				System.out.println(am12);
			}
			else
				System.out.println(arr[0] +":" + arr[2].charAt(2) + arr[2].charAt(1));		
			
		}
		else
		{	
			int tijd = Integer.parseInt(arr[0]);
			if(tijd < 12)
			{
				time+=12;
				twenty_four +=time+":" + arr[1]+ ":" + arr[2].charAt(0)  + arr[2].charAt(1);
				System.out.println(twenty_four);
			}
			else
				System.out.println(arr[0] + ":" + arr[1]  + ":" + arr[2].charAt(0) + arr[2].charAt(1));
		}
		
		
	}
}
