// (25-0) Lambda 예제
interface Calc {
      int cal(int a, int b ); 
}
class Lambda4 {
      public static void main(String[] args) {
          Calc c;
          c = (a, b) -> { return a + b; }; // return문이면 중괄호 생략 불가능
          System.out.println(c.cal(1, 2));
          c = (a, b) -> a + b; // 연산 진행 후 남은 결과는 명시하지 않아도 반환의 대상임
          System.out.println(c.cal(1, 2));
      }
}
