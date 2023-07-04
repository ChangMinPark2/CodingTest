package csStudyCodingTest.Level0;

public class 편지 {
    public static int solution(String message) {
        int answer = message.length()*2;

        return answer;
    }

    public static void main(String[] args) {
        String a = "i love you~";
        System.out.println(solution(a));

    }
}
