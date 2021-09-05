import java.util.*;
public class Calendar {
 
	 public static void main(String[] args){
			//˼·��
			//1������Scannerɨ������Ķ���
			Scanner input = new Scanner(System.in);
 
			//2���ӿ���̨�����û�¼�����ݡ��·�
			System.out.println("������");
			int year  = input.nextInt();
			System.out.println("������");
			int month  = input.nextInt();
 
			//3�����1900����뵱ǰ�����һ���������
			int totalDays = getFromNowYearTo1900TotalDays(year);
 
			//4����õ�ǰ���������������
			int totalDaysThisYear = getNowYearPassedTotalDays(year,month);
 
			//5����ø����·ݵ�һ���������
			int week = (totalDays + totalDaysThisYear +1) % 7;//�������ǣ�week = 0
 
			//6����ʽ���������
			formatCalendarOutput(week,year,month);
		}
 
		/**
		*��ʽ���������
		*@param week:��ǰ�·ݵ�һ���������
		*@param year:��ǰ���
		*@param month:��ǰ�·�
		*/
		public static void formatCalendarOutput(int week,int year,int month){
			int cnt = 0;//����������¼�հ������������ĺ�
			//1) ��ӡ��ͷ
			System.out.println("������\t\t����һ\t\t���ڶ�\t\t������\t\t������\t\t������\t\t������");
			//2����ӡ�հף��۲�������֮ǰ�ո���֮��Ĺ��ɣ�
			for(int i=1;i<= week;i++){
				System.out.print("\t\t");
				cnt++;
			}
			//3) ��ӡ����
			for(int i=1;i<=getNowMonthDays(year,month);i++){
				System.out.print(i+"\t\t");
				cnt++;
				//����¼�հ������������ĺ����ߵı�����Ӧ�û������
				if(cnt % 7 == 0){
					System.out.println();
				}
			}	
		}
 
 
		/**
		*�жϸ���������Ƿ�Ϊ����
		*@param year:���������
		*@return true:���ꣻfalse��ƽ��
		*/
		public static boolean isLeapYear(int year){
			return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);	
		}
 
		/**
		*���ݲ���ָ������ݣ��·ݣ������ǰ�µ�������
		*@param year:���
		*@param month:�·�
		*@return �µ�������
		*/
		public static int getNowMonthDays(int year,int month){//year:��Ƹò�����ԭ��2�·ݸ�������Ƿ���������ȷ����������
			switch(month){
				case 2:
					return isLeapYear(year) ? 29 : 28;
				case 4:
				case 6:
				case 9:
				case 11:
					return 30;
				default:
					return 31;
			}
		}
 
		/**
		*��õ�ǰ��ݵ���һ�����1900����������������
		*@param year ��ǰ���
		*@return ������
		*/
		public static int getFromNowYearTo1900TotalDays(int year){
			int totalDays = 0;
			for(int i = 1900; i< year; i++){//i:���
				totalDays += isLeapYear(i) ? 366 : 365;
			}
			return totalDays;
		}
 
		/**
		*�����ǰ��ݾ��������������ӵ�ǰ���1��1�յ������·ݵ���һ������ĩһ�죩
		*@param year:���
		*@param month:�·�
		*@return ������
		*/
		public static int getNowYearPassedTotalDays(int year,int month){
			int totalDays = 0;
			for(int i=1;i< month;i++){//i:�·�
				totalDays += getNowMonthDays(year,i);
			}
			return totalDays;
		}
		   
	  
}