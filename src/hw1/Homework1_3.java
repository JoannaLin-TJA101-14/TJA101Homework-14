package hw1;

public class Homework1_3 {

//題目3：請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	public static void main (String [] args) {
		int totalSecond = 256559;
		int oneDayTotalSecond = 24 * 60 * 60; //算出一天有幾秒
		int days = totalSecond / oneDayTotalSecond; //算出幾天
		int leftover = totalSecond % oneDayTotalSecond; //算除完天後,剩下多少秒數
		int hours = leftover / (60*60);//算出幾小時
		int leftover2 = leftover % (60*60); //算除完天後,剩下多少秒
		int min = leftover2 / 60;//算出多少分
		int sec = leftover2 % 60; //算出最後剩餘多少秒
		
		
			System.out.println(days+"天"+hours+"小時"+min+"分"+sec+"秒");
	}
}
