package csStudyCodingTest.Level0;

public class 숨어있는숫자덧셈 {
    public static int solution(String my_string) {
        int answer = 0;
        for (int i = 0; i<my_string.length(); i++){
            if (my_string.charAt(i) == '1' ||
                    my_string.charAt(i) == '2'||
                    my_string.charAt(i) == '3'||
                    my_string.charAt(i) == '4'||
                    my_string.charAt(i) == '5'||
                    my_string.charAt(i) == '6'||
                    my_string.charAt(i) == '7'||
                    my_string.charAt(i) == '8'||
                    my_string.charAt(i) == '9'){
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }
        }
        return answer;
    }

    public static int solution2(String my_string) {
        int answer = 0;
        for (int i = 0; i<my_string.length(); i++){
            if (Character.isDigit(my_string.charAt(i))){
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution2("abc12"));
    }
}
