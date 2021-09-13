// (27-3) reduce
import java.util.List;
import java.util.Arrays;
import java.util.function.BinaryOperator;

class Stream3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Lee", "Kim", "Park");
        
        BinaryOperator<String> comp = 
            (s1, s2) -> { 
               if(s1.length() > s2.length())
                   return s1;
               else 
                   return s2;                   
            };
        
        String str = list.stream()
                      .reduce("", comp);
        System.out.println(str);
        
        str = list.stream()
                .reduce("Jeong", comp);
        System.out.println(str);
    }
}
