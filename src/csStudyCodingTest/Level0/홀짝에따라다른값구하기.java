package csStudyCodingTest.Level0;

public class 홀짝에따라다른값구하기 {
    public static int solution(int n) {
        int answer = 0;
        if (n%2==0){
            for (int i = 2; i<=n; i+=2){
                answer += Math.pow(i, 2);
            }
        } else for (int i = 1; i<=n; i+=2){
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
