package csStudyCodingTest.Level0;

public class 피자나눠먹기2 {
    public static int solution(int n) {
        int answer = 0;
        int i = 6;
        while (true){
            if (i%n==0){
                answer++;
                break;
            }
            i+=6;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
