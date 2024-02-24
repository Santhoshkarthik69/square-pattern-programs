package pattern_programs;

import java.util.Scanner;

public class Rhombus_star 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please put rows value :");
		int rows=sc.nextInt();
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
             System.out.print("  ");
			}
			for(int k=1;k<=rows;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
