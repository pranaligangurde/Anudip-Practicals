/* Create Thread to find if the number is odd or even*/
package anudipprogram29;

import java.util.Scanner; 

public class ThreadEvenOdd1
{
	static EvenOdd e=new EvenOdd();
	
	public static void main(String[] args) {
		
	e.start();
	}
		
	}
    class EvenOdd extends Thread //creating thread using class threads
    {
    	public void run()
    	{
    		int num;
    		
    		System.out.println("Enter Number");
    		Scanner s=new 
    				Scanner(System.in);
    		num=s.nextInt();
    		if (num%2==0) 
    		{
    			System.out.println("Number is Even"); //print even if condition is true
    		}
    		else//print Odd
    			{
    				System.out.println("Number is odd"); //print even if condition is false
    			}
    		}
    	}
    


