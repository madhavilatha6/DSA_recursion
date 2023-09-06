public class prime {
   
	public static void main(String[] args)
	{
		int number = 10;
		
		for(int i =0;i<=number;i++)
		{
			int count = 0;
			for(int j = 1;j<=number;j++)
			{
				if(i%j==0)
				{
					count ++;
				}
			}
			if(count == 2)
			{
				System.out.println(i);
			}
			else
			{
				System.out.println("no prime numbers");
			}
		}
	}
}

