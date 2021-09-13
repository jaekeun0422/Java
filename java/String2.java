// (14-2) StringBuilder
class String2 {
    public static void main(String[] args) {
    	StringBuilder strbuf = new StringBuilder("123");
    	strbuf.append(45678);
    	System.out.println(strbuf);
    	strbuf.delete(0, 2);
    	System.out.println(strbuf);
    	strbuf.insert(2, "AB");
    	System.out.println(strbuf);
    	strbuf.reverse();
    	System.out.println(strbuf);
    	String sub = strbuf.substring(4, 6);
    	System.out.println(sub);
    	strbuf.replace(0, 4, "FEDC");
    	System.out.println(strbuf);
    }
}
