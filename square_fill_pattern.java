package pattern_programs;

import java.util.Scanner;

public class square_fill_pattern
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please put rows value :");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}


	}

}
