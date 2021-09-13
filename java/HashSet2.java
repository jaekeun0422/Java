// (21-4) HashSet<E> hash 메소드 사용
import java.util.HashSet;
import java.util.Objects;

class Person2 {
    private String name;
    private int age;
    
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String toString() {
        return "이름: "+name + " 나이: " + age;
    }
    
    public int hashCode() {
        return Objects.hash(name, age);
    }
    
    public boolean equals(Object obj) {
        Person2 comp = (Person2)obj;
        
        if(comp.name.equals(name) && (comp.age == age))
            return true;
        else
            return false;
    }
}

class HashSet2 {
    public static void main(String[] args) {
        HashSet<Person2> hSet = new HashSet<Person2>();
        hSet.add(new Person2("Park", 10));
        hSet.add(new Person2("Lee", 10));
       	hSet.add(new Person2("Park", 10 ));
        hSet.add(new Person2("Lee", 10));

        System.out.println("저장된 데이터 수: " + hSet.size());
        System.out.println(hSet);
    }
}