// (24-1) @Override
interface Viewable {
    public void show(String str);
}

class Viewer implements Viewable {
	String str;
	
	@Override
	public String toString() {
		return "입력 내용: " + str;
	}
	
    @Override
    public void show(String str) {
    	this.str = str;
        System.out.println(str);
    }
};

class Override1 {
    public static void main(String[] args) {
        Viewable view = new Viewer();
        view.show("@Overriding");
        System.out.println(view.toString());
    }
}
