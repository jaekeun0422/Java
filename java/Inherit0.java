// (16-0) 상속 example
class Parent0 {
      String name;
      public Parent0(String name) { // 생성자
            this.name = name;
      }
}
class Child0 extends Parent0 {
      String company;
      public Child0(String name, String company) { // 생성자
             super(name);
             this.company = company;
      }
}

class Inherit0 {
      public static void main(String[] args) {
             Child0 my = new Child0("Lee", "Google"); // 인스턴스 생성
             System.out.println("이름: "+my.name+" 회사: "+my.company);
      }
}
