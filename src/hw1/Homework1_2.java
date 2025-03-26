package hw1;

public class Homework1_2 {

//題目2：請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)

	public static void main (String[] args) {
	  int dozen = 12;//定義一打蛋為12顆
	  int dozen1 = 200 / dozen;
	  int leftover = 200 % dozen;
	  
	  	System.out.println("總共有" + dozen1 + "打" + leftover + "顆");
	  	//" "是要印出文字(字串); 200/dozen是要串出幾打蛋; 200% dozen是要算出餘多少蛋
	  	//相加會進行字串相聯	
			
	}
}