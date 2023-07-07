package csStudyCodingTest.Level0;

public class 문자열뒤집기 {
    public static String solution(String my_string) {
        String answer = "";

        for (int i = 0; i<my_string.length(); i++){
            answer += my_string.charAt(my_string.length() - 1 - i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String a = "abcdefg";

        System.out.println(solution(a));
    }
}
