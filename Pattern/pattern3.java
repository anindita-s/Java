class pattern3
{
	public static void main(String args[])
	{
		int i,j,n=8;
		for(i=0;i<n;i++)
		{
			for (j=0;j<i;j++)
			{
				System.out.print(" ");
			}
		for (j=n;j>i;j--)
			{
				System.out.print("#");
			}
		System.out.println();
		}
	}
}