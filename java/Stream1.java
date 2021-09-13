// (27-1) Collection 인스턴스 기반 스트림 생성 및 filtering
import java.util.List;
import java.util.Arrays;

class Stream1 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        Arrays.stream(ar)
            .filter(n -> n%2 == 1)
            .forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        List<String> list = Arrays.asList("Lee", "Kim", "Park");
        list.stream()
            .filter(s -> s.length() == 3)
            .forEach(s -> System.out.print(s + "\t"));
        System.out.println();       
    }
}