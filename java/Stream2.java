// (27-2) mapping
import java.util.List;
import java.util.ArrayList;

class PersonInfo {
    private String name;
    private int age;
    
    public PersonInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
    	return name;
    }
    public int getAge() {
    	return age;
    }
}

class Stream2 {
    public static void main(String[] args) {
        List<PersonInfo> list = new ArrayList<>();
        list.add(new PersonInfo("Lee", 10));
        list.add(new PersonInfo("Kim", 30));
        list.add(new PersonInfo("Park", 25));
                  
        list.stream()
                       .filter(age -> age.getAge() > 20)
                       .map(name -> name.getName().length())
                       .forEach(s -> System.out.print(s +"\t"));

        int sum = list.stream()
				       .filter(age -> age.getAge() > 20)
				       .mapToInt(n -> n.getAge())
				       .sum();
        System.out.println("\n20세 이상 사람의 나이 합: " + sum);
    }
}