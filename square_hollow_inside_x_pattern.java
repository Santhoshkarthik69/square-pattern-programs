package pattern_programs;

import java.util.Scanner;

public class square_hollow_inside_x_pattern
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("please put row value :");
				int rows=sc.nextInt();
				for(int i=1;i<=rows;i++)
				{
					for(int j=1;j<=rows;j++)
					{
						if(i==1||i==rows||j==1||j==rows||i==j||i+j==rows+1)
						{
						System.out.print("* ");
						}
						else
						{
							System.out.print("  ");
						}
					}
					System.out.println();
				}


			}

	}


