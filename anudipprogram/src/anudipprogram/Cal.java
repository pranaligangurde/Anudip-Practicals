package anudipprogram;


class Calcu {

	
	public void add(int a,int b)
	{
		try
		{
			int d=a;
			int e=b;
			System.out.println("This is try block of Calculation1 class and Addition of two parameters is: "+(d+e));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Calcu2
{
	public void add(int a,int b,int c)
	{
		try
		{
			int d=a;
			int e=b;
			int f=c;			
			System.out.println("This is try block of Calculation2 class and addition of three parameters is: "+(d+e+f));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class Cal {

	public static void main(String[] args)
	{
		Calcu c1=new Calcu();
		c1.add(4, 8);
		Calcu2 c2=new Calcu2();
		c2.add(2,7,10);
		
	}

}
