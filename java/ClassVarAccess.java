class ClassAccess {
    static int num = 100;
    ClassAccess() {
        increaseCnt();
    }
    void increaseCnt() {
        num++; // 클래스 내부에서 이름을 통한 접근
    }
}
class ClassVarAccess {
    public static void main(String[] args) {
        ClassAccess acc = new ClassAccess();
        
         acc.num++; // 인스턴스의 이름을 통한 접근
         ClassAccess.num++; // 클래스의 이름을 통한 접근
         
         System.out.println("num 값: "+acc.num);
     }
}
