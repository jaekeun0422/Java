// (21-1) LinkedList
import java.util.List;
import java.util.LinkedList;

class LinkedList1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        
        // 인스턴스 저장 
        list.add("Lee");
        list.add("Kim");
        list.add("Park");
	
        // 인스턴스 참조
        for(String s : list)
            System.out.print(s + '\t');
        System.out.println();
		
        // 첫 번째 인스턴스 삭제
        list.remove(0);
   
        // 삭제 후 인스턴스 참조
        for(String s : list)
            System.out.print(s + '\t');
        System.out.println();
    }
}