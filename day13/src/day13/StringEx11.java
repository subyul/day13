package day13;
import java.util.Scanner;
public class StringEx11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String start = "������";
		while(true)
		{
			System.out.println("���þ� : " + start);
			
			System.out.print("�Է� : ");
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
				System.out.println("�����ձ� ����");
				break;
			}
		}
	}

}
