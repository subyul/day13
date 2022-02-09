package day13;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringEx16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = "Life is too short.";
		System.out.println(text);
		
		String token[] = text.split(" ");
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String data = sc.next();
		
		String td [] = new String[text.length()];
		
		int check = -1;
		
		for(int i = 0; i<td.length;i++)
		{
			if(token[i].equals(data))
			{
				check = 1;
			}
			else
			{
				
			}
			
		}
		if(check == 1)
		{
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}
		
		
	}

}
