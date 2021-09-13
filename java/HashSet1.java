// (21-3) HashSet<E>
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

class HashSet1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Park");
	    set.add("Lee");
	    set.add("Park");
	    set.add("Kim");
        
        System.out.println("인스턴스 수: " + set.size());
		// enhanced for
        for(String s : set)
            System.out.print(s + '\t');
        System.out.println();
        // 반복자와 for문
        for(Iterator<String> itr = set.iterator(); itr.hasNext(); )
            System.out.print(itr.next() + '\t');
        System.out.println();
    }
}