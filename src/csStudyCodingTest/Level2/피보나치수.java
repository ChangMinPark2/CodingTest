package csStudyCodingTest.Level2;

public class 피보나치수 {

    public static int solution(int n) {
        return fib(n);
    }

    public static int fib(int n){
        if (n == 0 || n == 1) return 1;
        int answer = 0;
        int a = 0;
        int b = 1;

        for (int i = 2; i<=n; i++){
            answer = (a+b) % 1234567;
            a = b;
            b = answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
