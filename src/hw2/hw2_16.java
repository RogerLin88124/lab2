package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw2_16 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入 a or b");
		
		BufferedReader br1=	
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br1.readLine();
		char letter=str.charAt(0);
		
		switch(letter)
		{
			case 'a':
			{
				System.out.println("輸入的是a");
				break;
			}
			case 'b':
			{
				System.out.println("輸入的是b");
				break;
			}
			default:
			{
				System.out.println("請輸入的a或b");
				break;
			}
		}
		
	}

}
