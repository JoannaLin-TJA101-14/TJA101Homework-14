package hw1;

public class Homework1_6 {

//題目6：請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
// 5 + 5
// 5 + '5'
// 5 + "5"
	
	public static void main (String [] args) {
		int num = 5;
		int sum = num + num;
		int result = num + '5';
			System.out.println(sum);
			System.out.println(result);//'5'是字元,代表53,所以5+53=58
			System.out.println(num + "5"); //""代表字串,所以字串相加會進行字串相聯
	}
}
