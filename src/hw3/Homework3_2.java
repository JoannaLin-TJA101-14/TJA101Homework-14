package hw3;

import java.util.Scanner;

//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息。

public class Homework3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請開始猜");
		
		int num = (int)(Math.random()*10);  //產生1~9亂數
		int guess;  //把輸入的值指定型別
		int i = 0;
		
		while(i < 1) {
			guess = sc.nextInt();   //把輸入的值指定給一個變數
			if(guess == num) {
				System.out.println("叮咚叮咚~~~猜對囉!!");
				i++;
			}else {
				System.out.println("so sad~~ 繼續猜");
				continue;
			}
			
		}
	}

}
