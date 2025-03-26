package hw2;

//請建立一個TestNineNine.java程式,可輸出九九乘法表
//一:使用for迴圈 + while迴圈
//二:使用for迴圈 + do while迴圈
//三:使用while迴圈 + do while迴圈

public class TestNineNine {

	public static void main(String []args) {   
		//使用for迴圈 + while迴圈
//	 使用for迴圈 呈現1到9的乘數
//  		for (int i = 1; i <= 9; i++) {
//            int j = 1; // 乘數從 1 開始
//            while (j <= 9) { // 使用while 呈現被乘數
//                System.out.print(i + " × " + j + " = " + (i * j) + "\t");
//                j++; // 讓 j 遞增
//            }
//            System.out.println(); // 換行
//        }
	
		
		// 使用for迴圈 + do while迴圈
//		for (int i = 1; i<= 9; i++){
//			int j = 1;
//			do {
//				System.out.print(i + " × " + j + " = " + (i * j) + "\t"); 
//				j++;
//				}
//			while (j <=9);
//			System.out.println(); // 換行
//		}
		
		//使用while迴圈 + do while迴圈
		int i = 1;
		while (i <= 9) {
			int j = 1;// 被乘數從1開始
            
            do {
                System.out.print(i + " × " + j + " = " + (i * j) + "\t");
                j++; // 被乘數遞增
            } while (j <= 9); // 至少執行一次，直到j > 9
            
            System.out.println(); // 換行
            i++;           
        }				
	}
}
