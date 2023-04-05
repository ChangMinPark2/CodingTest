package csStudyCodingTest.Level1;

public class 수박수박수박수박수박수 {
    public static String solution(int n) {
        String answer = "수";
        for (int i = 2; i<=n; i++){
            if (i%2==0){
                answer += "박";
            } else answer += "수";
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(0));
    }
}
