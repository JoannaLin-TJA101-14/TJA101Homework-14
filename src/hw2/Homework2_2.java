package hw2;

//請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
//public class Homework2_2 {
//	public static void main(String [] args) {
//		
//		int sum = 0;  // 用來存放偶數和的變數
//        
//        for (int i = 2; i <= 1000; i += 2) {    // 使用 for 迴圈，從 2 開始，每次加 2
//            sum += i;  // 將偶數加入總和
//        }
//        
//        System.out.println(sum);		
//	}
//}

//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
//public class Homework2_2 {
//	public static void main(String [] args) {
//		long product = 1;  // 用來存放連乘積的結果，使用 long 型別避免溢位
//        
//        for (int i = 1; i <= 10; i++) {
//            product *= i;  // 相當於 product = product * i
//        }
//        
//        System.out.println(product);	
//	}
//}

//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
//public class Homework2_2 {
//	public static void main(String [] args) {
//		int number = 1;       // 初始值
//        long product = 1;     // 用來存放連乘積的結果，使用 long 型別避免溢位
//        
//        while (number <= 10) {
//            product *= number;  // 相當於 product = product * number
//            number++;           // 數字加 1
//        }
//        
//        System.out.println(product);
//		
//	}
//}

//請設計一隻Java程式,輸出結果為以下: 
//1 4 9 16 25 36 49 64 81 100

public class Homework2_2 {
	public static void main(String [] args) {

		for (int i = 1; i <= 10; i++) {
			int square = i * i;
			System.out.print(square + " ");
		}
	}
}
