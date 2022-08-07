package number;

public class Practice
{
	public static void main(String[] args)
	{
		int i=155;
		int temp=i;
		int sum=0;
		int r;
		while(i>0)
		{
			r=i%10;
//			r=r/10;
			sum=sum+r*r*r;
			r=r/10;
			
		}
		if(temp==sum)
		{
			System.out.println("No is armstrong");
		}
		else
		{
			System.out.println("No is not armstrong");
		}
			 
}
}


