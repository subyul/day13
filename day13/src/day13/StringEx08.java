package day13;
import java.util.StringTokenizer;
public class StringEx08 {
	public static void main(String[] args) {
		String str = "��ö��/87,�̸���/42,�̿���/95";
		
		String name [] = new String[3];
		int score [] = new int [3];
		
		
		String temp [] = str.split(",");
		for(int i = 0; i<temp.length;i++)
		{
			String[] info = temp[i].split("/");
			
			name[i] = info[0];
			score[i] = Integer.parseInt(info[1]);
		}
		
		
		for(int i = 0; i<3;i++)
		{
			System.out.println("�̸� : "+name[i]+" ���� : "+score[i]);
		}
	
		
			
		
	}

}
