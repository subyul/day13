package day13;
import java.util.Scanner;
public class StringEx13 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String name = "�ڳ���";
	
	System.out.println("���� �̸��� �Է��ϼ��� : "+name);
	String data = sc.next();
	
	int check = -1;
	
	if(name.length()==data.length())
	{
		check = 1;
		for(int i = 0; i<name.length();i++)
		{
			char n = name.charAt(i);
			char d = data.charAt(i);
			
			if(n == d)
			{
				check = 1;
			}
			else
			{
				check = -1;
			}
		}
	}
	
	if(check == 1)
	{
		System.out.println("��ġ");
	}
	else
	{
		System.out.println("����ġ");
	}
}
}
