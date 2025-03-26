package hw2;

// 請設計一隻Java程式,輸出結果為以下:
// A
// BB
// CCC
// DDDD
// EEEEE
// FFFFFF

public class Homework2_5 {
	public static void main(String[] args) {
        char letter = 'A'; // 起始字母

        for (int row = 1; row <= 6; row++) { // 控制輸出6行
            for (int count = 0; count < row; count++) { // 每行輸出 row 個相同字母
                System.out.print(letter);
            }
            System.out.println(); // 換行
            letter++; // 下一個字母
        }
    }

}
