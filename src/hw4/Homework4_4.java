package hw4;

import java.util.Scanner;

//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//表如下:
//
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//員工編號: 25 19 27 共 3 人!」
//
//(提示:Scanner,二維陣列)

public class Homework4_4 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入你想借款的金額");
		int m = sc.nextInt();
		int count = 0;
		
		//把同事的員工編號與對應可借款的金額填入陣列
		int[][] x= {
			{25,32,8,19,27},
			{2500,800,500,1000,1200}
		};
		
		
		System.out.print("可借款的員工編號：");
		
		//跑迴圈去找想借的錢是否小於同事可借的錢
		//因第一個是員工編號，要從第二個的錢開始去做比對找出來
		for(int i = 1 ; i < x.length ; i++) {
			for(int j = 0; j < x[i].length ; j++) {
				
				if(m < x[i][j] && m > 0) {
					
					System.out.print(x[0][j]+" ");
					count++;
				   }else {
					   continue;
				   }
				}
			}
		System.out.print("共" + count + "人！");
		}

}
