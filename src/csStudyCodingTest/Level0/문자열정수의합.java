package csStudyCodingTest.Level0;

public class 문자열정수의합 {
    public static int solution(String num_str) {
        int answer = 0;

        for(int i = 0; i<num_str.length(); i++){
            answer += Integer.parseInt(num_str.substring(i,i+1));
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("123456789"));
    }
}
