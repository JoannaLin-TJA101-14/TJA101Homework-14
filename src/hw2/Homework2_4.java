package hw2;

// 請設計一隻Java程式,輸出結果為以下:
// 1 2 3 4 5 6 7 8 9 10
// 1 2 3 4 5 6 7 8 9
// 1 2 3 4 5 6 7 8
// 1 2 3 4 5 6 7
// 1 2 3 4 5 6
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

public class Homework2_4 {
	public static void main(String[] args) {
        // 外層迴圈控制行數，從10開始，每次減1，直到1
        for (int i = 10; i >= 1; i--) {
            // 內層迴圈控制該行輸出的數字
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // 輸出數字,還要加上空格
            }
            System.out.println(); // 換行
        }
    }

}
