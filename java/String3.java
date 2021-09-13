// (14-3) toString() 제정의
class Human {
	private int age;
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// return super.toString();
		return "My age is " + age;
	}
}
class String3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("990101-1234567");
        sb.replace(6, 7, " ");
        System.out.println(sb.toString());
        System.out.println(sb);
        
        Human hu = new Human();
        hu.setAge(30);
        System.out.println(hu.toString());
    }
}