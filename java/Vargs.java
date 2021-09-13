// (23-1) 가변 인자
class Vargs {
    public static void show(String... vargs) {
        System.out.println("가변인자 개수: " + vargs.length);

        for(String s : vargs) 
            System.out.print(s + '\t');
        System.out.println();
    }

    public static void main(String[] args) {
        show("Lee");
        show("Lee", "Kim", "Park");
    }
}
