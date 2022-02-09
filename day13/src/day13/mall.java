package day13;
import java.util.Scanner;
public class mall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mall [][] = new String [100][2];
		for(int i = 0; i<mall.length;i++)
		{
			mall[i][0]= "";
			mall[i][1]="";
		}
		
		int  itemcount = 0;
		while(true)
		{
			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템 관리");
			System.out.println("[3]전체품목 출력");
			System.out.println("[4]종      료");
			System.out.print(":");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				System.out.println("카테고리를 입력하세요 : ");
				String gori = sc.next();
				
				mall[itemcount][0] = gori;
				itemcount++;
			}
			else if(select == 2)
			{
				for(int i = 0; i<itemcount;i++)
				{
						System.out.println("["+i+"]"+mall[i][0]);
				}
						System.out.println("추가할 카테고리를 입력하세요");
						int selgori = sc.nextInt();
						
								System.out.println("추가할 아이템을 입력하세요 :");
								String item = sc.next();
								
								mall[selgori][1]+=item;
								mall[selgori][1]+="/";
								
			}
			
			else if(select == 3)
			{
				
			}
							
						}
					}
				
			}
			
	

