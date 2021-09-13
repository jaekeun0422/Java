class Position { 
    int xPos, yPos;

    public Position(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void showPosition() { 
        System.out.println("좌표 [" + xPos + ", " + yPos + "]"); 
    }
}

class Circle
{
    int rad;	// 반지름
    Position center;    // 원의 중심
    
    public Circle(int x, int y, int r) {
        center = new Position(x, y);
        rad = r;
    }
    
    public void showCircle() {
        center.showPosition();
        System.out.println("반지름: " + rad);
    }
}

class DrawCircle {
    public static void main(String[] args) {
        // 좌표 [2, 2] 반지름 5인 원의 생성
        Circle c = new Circle(2, 2, 5);

        // 원의 정보 출력
        c.showCircle();
    }
}

