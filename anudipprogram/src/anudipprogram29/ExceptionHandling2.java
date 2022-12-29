package anudipprogram29;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		{
			  int i,j;
			  try
			  {
				 
				  Scanner sc= new
				  Scanner(System.in);
							 
			      System.out.println("enter the first number");
			  	  i=sc.nextInt();
			      System.out.println ("enter the second number");
			      j=sc.nextInt();
							      
			      System.out.println(i/j);
			  }
							     
			  catch ( Exception e)
			 {
					System.out.println(e);
			 }
							     System.out.println("end");
					}
				}
						  
							  
		}


