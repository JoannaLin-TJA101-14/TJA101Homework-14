package hw1;

public class Homework1_4 {

//題目4：請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
	
	public static void main (String [] args) {
		final double PI = 3.1415; //定義圓周率 不變的常數
		int radius = 5; //定義半徑為5
		
		double Area = radius * radius * PI; //算圓面積
		double circumference = (radius*2) * PI; //算圓周長
		
			System.out.println(Area);
			System.out.println(circumference);
		
	}
}
