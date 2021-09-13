// (15-1) 배열의 생성
public class Array1 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[2] = 9; // 세번쨰 요소
		System.out.println("배열의 길이: " + arr.length);
		for (int i=0; i < arr.length; i++) {
			System.out.printf("배열의 %d요소의 값은 %d\n", i, arr[i]);
		}
	}
}