package hw4;

//有個字串陣列如下 (八大行星):
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示:字元比對,String方法)

public class Homework4_3 {
	public static void main(String[] args) {
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int count = 0;
		for (int i = 0; i < planets.length; i++) {
			String planet = planets[i];
			
			
			// 查行星名稱中的每個字元
            for (int j = 0; j < planet.length(); j++) {
                char word = planet.charAt(j);
                
                // 檢查是否為母音
                if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {
                    count++;
                }
            }
		}
		System.out.println("八大行星名稱中的母音總數為: " + count);
	}
}
		




