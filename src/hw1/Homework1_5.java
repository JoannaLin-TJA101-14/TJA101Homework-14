package hw1;

public class Homework1_5 {

//題目5：某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,
	//請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
	
	// 【複利公式】FV ＝ PV×（1 ＋ R）n 次方
	//	FV 為期末本利和，PV 為期初本金，R 為每期利率，n 為期數也就是--
	//	期末本利和＝期初本金×（1＋利率）期數次方。
	
	public static void main (String [] args) {
		int pv = 1500000;//定義期初本金
		double R = 0.02; //定義利率為2%
		int yyear = 10; //定義10年
		
		double Sum1 = pv * (1 + R);
		double Sum2 = Sum1 * (1 + R);
		double Sum3 = Sum2 * (1 + R);
		double Sum4 = Sum3 * (1 + R);
		double Sum5 = Sum4 * (1 + R);
		double Sum6 = Sum5 * (1 + R);
		double Sum7 = Sum6 * (1 + R);
		double Sum8 = Sum7 * (1 + R);
		double Sum9 = Sum8 * (1 + R);
		double Sum10 = Sum9 * (1 + R); 
			System.out.println(Sum10);
	}
}
