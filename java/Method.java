// (9-1) method
public class Method {
	public static void main(String[] args) {
		int sum;
		double square;
		
		sum = calcSum(100, 200);
        System.out.println("덧셈 결과: " + sum);
        square = calcSquare(4.5, 5.0);
        System.out.println("넓이 결과: " + square);
        
        System.out.println("factorial: "+factorial(5));
    }
    
    public static int calcSum(int n1, int n2) {
    	int result = n1 + n2;
    	return result;
    }
    public static double calcSquare(double n1, double n2) {
    	double result = n1 * n2;
    	return result;
    }
    // (9-2) factorial
    public static int factorial(int n) {
    	if (n == 1)
    		return 1;
    	else
    		return n * factorial(n-1);
    }
}
