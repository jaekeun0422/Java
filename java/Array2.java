// (15-2) String형 배열
public class Array2 {
	public static void main(String[] args) {
		String[] str = new String[5];
		str[0] = new String("Korea");
		str[1] = new String("Seoul");
		str[2] = new String("Busan");
		str[3] = new String("Daegu");
		str[4] = new String("Incheon");
		System.out.println("배열의 길이: " + str.length);
		
		int totalCnt = 0;
		for (int i=0; i < str.length; i++) {
			totalCnt += str[i].length();
		}
		System.out.println("총 문자 수: " + totalCnt);
	}
}
