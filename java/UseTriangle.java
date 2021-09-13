class Triangle {
    double bottom;
    double height;
    
    public Triangle(double bt, double hg) {
        bottom = bt;
        height = hg;
    }
      
    public void setBottom(double bt) {
        bottom = bt;
    }
    
    public void setHeight(double hg) {
        height = hg;
    }
    
    public double calcArea() {
        return bottom * height / 2;
    }
}

class UseTriangle {
    public static void main(String[] args) {
        Triangle t = new Triangle(10, 5);
        System.out.println("삼각형의 넓이: " + t.calcArea());
        
        t.setBottom(20.6);
        t.setHeight(8.4);
        System.out.println("삼각형의 넓이: " + t.calcArea());	
    }
}

