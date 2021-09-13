// 하나의 클래스 파일에 하나 이상의 main() 메소드 있을 수 없음
// 각 클래스 파일이 main() 메소드를 포함하는 것은 상관없음

public class HelloWorld00 {
	public static void main(String[] args) {
		System.out.println("1st Hello JavaWorld");
	}
}

class String0 {
    public static void main(String[] args) {
        String s1 = "990101-1234567";
        String s2 = s1.substring(0, 6) + ' ' + s1.substring(7);
        System.out.println(s2);
        
        s2 = s2.replace(" ", "-");
        System.out.println(s2);
    }
}