class String1 {
    public static void main(String[] args) {
        String s1 = "990101-1234567";
        String s2 = s1.substring(0, 6) + ' ' + s1.substring(7);
        System.out.println(s2);
        
        s2 = s2.replace(" ", "-");
        System.out.println(s2);
    }
}