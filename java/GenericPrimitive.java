// (20-1) Generic and Primitive
class Box<T> {
    private T obj;

    public void set(T o) {
        obj = o;
    }
    public T get() {
        return obj;
    }
}

class GenericPrimitive {
    public static void main(String[] args) {
        Box<Integer> iBox = new Box<Integer>();
    
        iBox.set(100);
        int num = iBox.get();

        System.out.println(num);
    }
}