package number;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int a=20;
		int count=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				count++;
	
			}
		}
			if(count==0)
			{
				System.out.println(a+"-no is  prime");
			}
			else
			{
			System.out.println(a+"-no is not prime");
		     }
			System.out.println(count);
		}
		

}
