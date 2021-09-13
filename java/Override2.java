// (24-1) @Override
class Viewer1 {
	String str;
	
	@Override
	public String toString() {
		return "입력 내용: " + str;
	}
	
    public void show(String str) {
    	this.str = str;
        System.out.println(str);
    }
};

class Override2 {
    public static void main(String[] args) {
        Viewer1 view = new Viewer1();
        view.show("@Overriding");
        System.out.println(view.toString());
    }
}
