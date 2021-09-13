//(22-1) 열거형
enum State { 
	CA("California"), MD("Maryland"), FL("Florida"), NV("Nevada");

    String name;
    
    private State(String name) { 
        this.name = name;
    }

    @Override
    public String toString() {
        return "미국 주 이름: " + name;
    }
}

class Enum {
    public static void main(String[] args) {
        System.out.println(State.MD);
        System.out.println(State.NV);
    }
}
