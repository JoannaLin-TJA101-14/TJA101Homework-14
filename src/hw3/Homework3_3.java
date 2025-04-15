package hw3;

import java.util.Scanner;

//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//的號碼與總數,如圖:

public class Homework3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個不想要的1~9數字");
		
		int i = sc.nextInt();   //把輸入的值指定給一個變數
		int count = 0; // 計算符合條件的數字數量

		for (int j = 1; j <= 49; j++) {     
			if (j % 10 != i && j/10 != i) {   // 檢查數字是否包含不想要的數字
				System.out.print(j + " ");  //印出符合條件的數字
				count++;   // 計數器 +1
			}
		}
		System.out.println();   //只是為了換行用的
		System.out.println("\n總共有：" + count + " 個數字");
		  
	}

}
