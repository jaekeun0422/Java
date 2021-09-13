// (15-3) 최대값, 최소값
class Array3 {
    public static int maxValue(int[] arr) {
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i])
                max = arr[i]; // 큰 값을 저장
        }
        return max;
    }
    
    public static int minValue(int[] arr) {
        int min = arr[0];
        
        for(int value: arr) {
            if(min > value)
                min = value; // 작은 값을 저장
        }
        return min;
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 2, 19, 22, 90, 40, 9, 45, 89, 70};        
        System.out.println("최소값: " + minValue(arr));
        System.out.println("최대값: " + maxValue(arr));
    }
}
