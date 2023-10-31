package csStudyCodingTest.Level0;

public class 코테연습문자열뒤집기 {

    public String solution(String my_string, int s, int e) {
        String answer = "";

        for(int i = 0; i < s; i++){
            answer += answer.charAt(i);
        }
         for(int i = e - 1; i > s; i --){
             answer += answer.charAt(i);
         }
         for(int i = e; i < my_string.length(); i++){
             answer += answer.charAt(i);
         }
        return answer;
    }
}
