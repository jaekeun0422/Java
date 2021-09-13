//(19-2) object형 정렬
import java.util.Arrays;

class Person1 implements Comparable {
    private int age;

    public Person1(int age) {
        this.age = age;
    }    

    @Override
    public int compareTo(Object ar) {
        Person1 p = (Person1)ar;
        return this.age - p.age;
    }
    
    @Override
    public String toString() {
        return "나이: " + age;
    }
}

class SortObject {
    public static void main(String[] args) {
        Person1[] arr = new Person1[3];

        arr[0] = new Person1(20);
        arr[1] = new Person1(30);
        arr[2] = new Person1(10);

        Arrays.sort(arr);

        for(Person1 p : arr) 
            System.out.println(p);
    }
}

