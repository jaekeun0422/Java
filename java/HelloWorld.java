
public class HelloWorld {
	public static void main(String[] args) {
		// (1-1) first Java program
		System.out.println("Hello JavaWorld");
		
		// (1-2) 문자, 숫자 그리고 소괄호()
        System.out.println("1 + 2 = " + 1 + 2 );
        System.out.println("1 + 2 = " + (1 + 2));
        
        // (1-3) 다양한 방식
        System.out.println(12);
        System.out.println("12");
        System.out.println("1" + "2");
        System.out.println("1" + 2);
        System.out.println(1 + "2");
        
        // (2-1) true/false
        int num1 = 10, num2 = 20;
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);

        // (2-2) char
        char c1 = '대', c2 = '한', c3 = '민', c4 = '국';
        System.out.println(c1+" "+c2+" "+c3+" "+c4);
        System.out.println(c1); // 문자 '대'
        System.out.println(c1+0); // 문자 '대'의 unicode 코드 값
        System.out.println(c2+0);
        System.out.println(c3+0);
        System.out.println(c4+0);
        System.out.println(c1+c2+c3+c4); //45824+54620+48124+44397=192965

		// (3-1) final char
		final char CONST_CHAR = '가';
		System.out.println("상수 표시: " + CONST_CHAR);

		// (3-2) \u2605 = ★
		System.out.println("★ 표시: " + '\u2605');
		
		// (4) 자료형 찾기
	    double dNum = 10; // 기본 자료형에서는 찾기 불가능(그냥 알아야 함)
	    System.out.println(dNum); // 결과는 10.0
	    Double dNumber = 10.0; // wrapper type으로 변환하면 instanceof를 이용하여 체크
	    if (dNumber instanceof Double)
	    	System.out.println("변수 number의 자료형은 Double이 맞다");
	    else
	    	System.out.println("변수 number의 자료형은 Double이 아니다");
        // (4) 형 변환	    
	    double pi = 3.14;
	    int iNumber = (int) pi;
	    System.out.println(iNumber); // 결과는 3
	    
		// (4-1) (short)
		short s_num1 = 10;
		short s_num2 = 20;
		//short s_num3 = s_num1 + s_num2; // Type mismatch cannot convert from int to short
		short s_num3 = (short) (s_num1 + s_num2);
		System.out.println("형 변환: " + s_num3);		
		
		// (5 논리연산자)
		int num3 = 0; 
        int num4 = 0;
        boolean result;
        
        result = ((num3 += 10) < 0) && ((num4 += 10) > 0);
        System.out.println("result = " + result);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4 + '\n');
		
        result = ((num3 += 10) > 0) || ((num4 += 10) > 0);
        System.out.println("result = " + result);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        
        // (5 증감연산자)
        int num5 = 10; 
        int a = 20;
        num5 = a++;
        System.out.println("num5 = " + num5 + " a = " + a);
        num5 = ++a;
        System.out.println("num5 = " + num5 + " a = " + a);
        
		// (5-1-1) 복합 대입 연산자(+=, -=, *=, /=, %=)
		int rate = 2;
		rate *= 2.5;
		System.out.println("복합 대입 연산자: " + rate);	
		
		// (5-1-2) 복합 대입 연산자(+=, -=, *=, /=, %=)
		int rate1 = 2;
		rate1 = (int) (rate1 * 2.5);
		System.out.println("복합 대입 연산자: " + rate1);	
		
		// (5-2) 덧셈
        int n = 1 + 2;
        System.out.println("1 + 2 = " + n);
        n += 3;
        System.out.println("1 + 2 + 3 = " + n);
        n += 4;
        System.out.println("1 + 2 + 3 + 4 = " + n);
        
        // (6-1) if ~ else
        int num6 = 100;
        if(num6 > 0 && (num6 % 2) == 0)
            System.out.println("양수이면서 짝수");
		
        // (6-2) if ~ else 4가지 조건
        int num7 = 90;
        if (num7 < 80)
        	System.out.println("80점 미만");
        else if (num7 < 90)
            	System.out.println("90점 미만");
        else if (num7 < 100)
        	System.out.println("100점 미만");
        else
        	System.out.println("100점");
        
        // (7-1) if ~ else(6-2) => switch 변경
        num7 = 79;
        switch(num7 / 10) {
        case 8:
            System.out.println("90점 미만의 수");
            break;
        case 9:
            System.out.println("100점 미만의 수");
            break;
        case 10:
            System.out.println("100점");
            break;
        default:
            System.out.println("80점 미만의 수");
        }
        
        // (8-1) for 1~100 합계
        int sum = 1;
        for(int i = 1; i <= 100; i++)
            sum += i;  
        System.out.println("1~100까지의 합: " + sum);
        
        // (8-2) for 구구단 9단
        for(int i = 1; i < 10; i++)
            System.out.println("9 x " + i + " = " + (9 * i));
        
        // (8-3) while
        int num = 1;
        sum = 0;
        while(num <= 100) {
            if((num % 2) == 0 && (num % 5) == 0) {
                System.out.println(num);
                sum += num;
            }
            num++;
        }
        System.out.println("2의 배수이며 5의 배수인 수의 합: " + sum);
        
        // (8-4) do ~ while
        num = 1;
        while(num <= 10)
            System.out.println(num++);
        do {
            System.out.println(--num);
        } while(num>1);
        
        // (8-5) break
        sum = 0;
        num = 1;    
        while(true) {
            if(num % 2 != 0)
                sum += num;

            if(sum > 100) {
                System.out.println(num + " 더할 때 100이 넘어");
                System.out.println("초과된 값: " + sum);
                break;
            }   
            num++;
        }
        
        // (8-6) for 구구단
        for(int i = 2; i < 10; i += 2) {
            for(int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
                if(j >= i)
                    break;
            }
        }
	}
}