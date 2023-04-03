package csStudyCodingTest.Level1;

public class 가운데글자가져오기 {
    public static String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 0){
            answer += s.charAt(s.length()/2 - 1);
            answer += s.charAt(s.length()/2);
        } else if (s.length() % 2 == 1){
            answer += s.charAt(s.length()/2);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("1234"));
    }
}
