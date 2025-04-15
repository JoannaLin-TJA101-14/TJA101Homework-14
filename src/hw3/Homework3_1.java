package hw3;

//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形,

import java.util.Scanner;

public class Homework3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		int data3 = sc.nextInt();
		
//		System.out.println(data1 + data2 + data3); //這是測試上面程式碼是否有執行的測試
		
		// 檢查是否能形成三角形
        if ((data1 + data2 > data3) || (data1 + data3 > data2) || (data2 + data3 > data1)) {
        	System.out.println(data1);
        	System.out.println(data2);
        	System.out.println(data3);
//            // 判斷三角形類型
            if (data1 == data2 && data2 == data3) {
                System.out.println("正三角形");
            } else if (data1 == data2 || data1 == data3 || data2 == data3) {
                System.out.println("等腰三角形");
            } else {
                System.out.println("其它三角形");
            }
        } else {
            System.out.println("不是三角形");
        }
	}

}
 
