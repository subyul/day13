package day13;

public class Ex1 {
public static void main(String[] args) {
	
	int intArray [] = new int [5];
	
	try {
		intArray[3] = 10;
		intArray[6] = 5;
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("예외문 잡아줌");
	}
	
	
}
}
