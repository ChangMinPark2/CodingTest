package csStudyCodingTest.Level0;

public class 문자열앞에n글자 {
    public static String solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i<n; i++){
            answer += my_string.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String a = "He110WOr1d";
        System.out.println(solution(a, 5));
    }
}
