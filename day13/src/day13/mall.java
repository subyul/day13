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
			System.out.println("[������ ���]");
			System.out.println("[1]ī�װ� ����");
			System.out.println("[2]�� �� �� ����");
			System.out.println("[3]��üǰ�� ���");
			System.out.println("[4]��      ��");
			System.out.print(":");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				System.out.println("ī�װ��� �Է��ϼ��� : ");
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
						System.out.println("�߰��� ī�װ��� �Է��ϼ���");
						int selgori = sc.nextInt();
						
								System.out.println("�߰��� �������� �Է��ϼ��� :");
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
			
	

