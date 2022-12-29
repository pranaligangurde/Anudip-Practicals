
//Write a program take a input from the age  the user if the age is above 18 print "you are eligible 
//to  vote  else throw an ecepation that age is not correct.

package anudipprogram29;
 import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in); //taking input from the user

		System.out.println("Enter your age");
		age=sc.nextInt();
		try {
			
			if(age>=18)
				
				System.out.println("you are eligible for voting");// print the eligible age
			else {
				throw new Exception("you are not eligible for voting");//print the not eligible age
			}
		}
		    catch(Exception e)
		    		{
		    	System.out.println(e);
		    		}
		
		          
	}
	

}
