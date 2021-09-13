class ImmutableString {
    public static void main(String[] args) {
        String str1 = "Korea";
        String str2 = "Korea";
        
        String str3 = new String("Korea");
        String str4 = new String("Korea");
        
        if(str1 == str2)
            System.out.println("str1과 str2는 동일 인스턴스 참조");
        else
            System.out.println("str1과 str2는 다른 인스턴스 참조");

        if(str3 == str4)
            System.out.println("str3과 str4는 동일 인스턴스 참조");
        else
            System.out.println("str3과 str4는 다른 인스턴스 참조");
        
        if(str1.equals(str2))
            System.out.println("str1과 str2는 문자열 내용이 같다");
        else
        	System.out.println("str1과 str2는 문자열 내용이 다르다");
        
        if(str3.equals(str4))
            System.out.println("str3과 str4는 문자열 내용이 같다");
        else
        	System.out.println("str3과 str4는 문자열 내용이 다르다");
    }
}