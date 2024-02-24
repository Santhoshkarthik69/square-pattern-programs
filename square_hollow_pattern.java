package pattern_programs;
import java.util.*;
public class square_hollow_pattern 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please put row value :");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows;j++)
			{
				if(i==1||i==rows||j==1||j==rows)
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
