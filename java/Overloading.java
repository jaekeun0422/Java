class Person {
    private String name;     // 이름
    private int phoneNum;  // 전화번호
    
    Person(String pname) {
        name = pname;
    }
    
    Person(String pname, int pnum) {
        name = pname;
        phoneNum = pnum;
    }
    
    void showPerson() {
        System.out.println("이름: " + name);
        
        if (phoneNum != 0)
            System.out.println("전화 번호: " + phoneNum);
        else
            System.out.println("번화번호가 없음");
    }
}

class Overloading {
    public static void main(String[] args) {
        // 전화번호가 있는 사람의 정보를 담은 인스턴스 생성
        Person lee = new Person("이순신", 1004);
        
        // 전화번호가 없는 사람의 정보를 담은 인스턴스 생성
        Person kim = new Person("김삿갓");

        lee.showPerson();
        kim.showPerson();
    }
}