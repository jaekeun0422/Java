// (16-1) 상속 - 클래스 변수, 클래스 메소드
class Parent {
    protected static int count = 10;

    public Parent() {
        count++;
    }
}

class Child extends Parent {
    public void showCount() {
        System.out.println(count);
    }
}

class InheritStatic {
    public static void main(String[] args) {
        Parent s1 = new Parent();
        Parent s2 = new Parent();
        
        Child s3 = new Child(); // Parent 생성자 호출됨
        s3.showCount(); // 13
    }
}
