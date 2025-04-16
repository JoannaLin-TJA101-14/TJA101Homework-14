package hw4;

//有個一維陣列如下:
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示:陣列,length屬性)

public class Homework4_1 {

	public static void main(String[] args) {
//		int x[] = new int[9];   //也可以寫成下面那行
		int[] intArray = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};   //直接把數字宣告在裡面
		int sum = 0;   //總和起的數字指定給一個變數
		
		double avg;
		
		for (int i =0; i < intArray.length; i++) {
			sum += intArray[i];   //sum = sum + intArray[i]
			}
		avg = (double)sum / intArray.length;
		System.out.println("平均值為: " + avg);
		System.out.println();
		System.out.println("大於平均值的數有這些: " );
		
		for (int i =0; i < intArray.length; i++) {
			if (avg < intArray[i])
				System.out.println(intArray[i]);
		}
		
	}
	
	
		
}
