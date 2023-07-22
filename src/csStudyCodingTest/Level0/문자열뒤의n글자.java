package csStudyCodingTest.Level0;

public class 문자열뒤의n글자 {
    public static String solution(String my_string, int n) {
        String answer = "";
        for (int i = my_string.length() - n; i<my_string.length(); i++){
            answer += my_string.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String a = "Progammers123";
        int n = 11;
        System.out.println(solution(a, n));
    }
}
