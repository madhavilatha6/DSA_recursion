class factorial
{
	public static void main(String[] args)
	{
		int num = 7;
		System.out.println(factNum(num));
	}
	public static int factNum(int num)
	{
		int factorial = 1;
		for(int i = 1;i <= num;i++)
		{
			factorial *= i;
		}
		return factorial;
		
	}
}