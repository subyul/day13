package day13;
import java.util.Scanner;
public class StringEx11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String start = "자전거";
		while(true)
		{
			System.out.println("제시어 : " + start);
			
			System.out.print("입력 : ");
			String data = sc.next();
			
			int len = start.length()-1;
			char st = start.charAt(len);
			char dt = data.charAt(0);
			if(st == dt)
			{
				start = data;
			}
			else
			{
				System.out.println("끝말잇기 실패");
				break;
			}
		}
	}

}
