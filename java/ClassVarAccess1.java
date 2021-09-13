class ClassAccess0 {
    int num = 100;
    ClassAccess0() {
        increaseCnt();
    }
    static void increaseCnt() {
       //num++; // 클래스 내부에서 이름을 통한 접근
    }
}
class ClassVarAccess1 {
    public static void main(String[] args) {
        ClassAccess0 acc = new ClassAccess0();
        
         acc.num++; // 인스턴스의 이름을 통한 접근
         //ClassAccess0.num++; // 클래스의 이름을 통한 접근
         
         System.out.println("num 값: "+acc.num);
     }
}
