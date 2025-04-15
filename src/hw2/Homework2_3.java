package hw2;
//阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。

//請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?

public class Homework2_3 {
	public static void main(String[] args) {
		int count = 0; // 計算符合條件的數字數量

		for (int i = 1; i <= 49; i++) {
			// 檢查數字是否包含4
			if (i % 10 == 4 || i / 10 == 4) {
				continue; // 若數字包含4，則跳過;不可以用break,會直接強制結束
			}
			System.out.print(i + " "); // 輸出符合條件的數字
			count++; // 計數器 +1
		}

		System.out.println("\n總共有：" + count + " 個數字");
	}

}
