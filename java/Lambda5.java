// (25-1) 람다
interface StrLen {
    int len(String s);    // 값을 반환하는 메소드
}

class Lambda5 { 
    public static void main(String[] args) {
        StrLen sl = s -> s.length();
        String str = "Hello Lamdba";
        System.out.println(str+"의 길이는 "+ sl.len(str));
    }
}