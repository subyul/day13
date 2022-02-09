package day13;

public class StringEx07 {
public static void main(String[] args) {
	String str = "11/100/89";
	int arr[] = new int [3];
	String temp [] = str.split("/");
	
	int sum = 0;
	for(int i = 0;i<temp.length;i++)
	{
		arr[i] = Integer.parseInt(temp[i]);
		sum += arr[i];
		
	}
	System.out.println(sum);
	
	
	int scores[] = {11,100,89};
	String text = "";
	for(int i = 0;i<scores.length;i++)
	{
		text += scores[i] + "";
		System.out.println(text);
		if(i != scores.length-1)
		{
			text +="/";
		}
	}
	System.out.println(text);
}
}
