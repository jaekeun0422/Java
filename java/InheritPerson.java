// (16-2) 상속
class Family {
    protected String name;
    protected String phone;

    public Family(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public void showInfo() {
    	System.out.println("이름: "+name);
    	System.out.println("전화번호: "+phone);
    }
}

class Friend extends Family {
	private String address;
	
    public Friend(String name, String phone, String address) {
    	super(name, phone);
        this.address = address;
    }
    public void showInfo() {
    	super.showInfo();
    	System.out.println("주소: "+address);
    }
}

class UnivFriend extends Family {
	private String major;
	
    public UnivFriend(String name, String phone, String major) {
    	super(name, phone);
        this.major = major;
    }
    public void showInfo() {
    	super.showInfo();
    	System.out.println("학과: "+major);
    }
}
class InheritPerson {
    public static void main(String[] args) {
    	Family[] f = new Family[10];
    	int cnt = 0;
    	
    	f[cnt++] = new Friend("Lee", "010-1111-1004", "서울시");
    	f[cnt++] = new Friend("Kim", "010-2222-1004", "성남시");
    	f[cnt++] = new UnivFriend("Park", "010-3333-1004", "유아교육과");
    	f[cnt++] = new UnivFriend("Choi", "010-4444-1004", "IT소프트웨어과");
    	
    	// 모든 가족, 친구, 동창의 정보 전체 출력
    	for (int i = 0; i < cnt; i++) {
    		f[i].showInfo(); //오버라이딩한 메소드가 호출
    		System.out.println();
    	}
    }
}
