package csStudyCodingTest.Level1;

//문자열 s의 길이는 4 혹은 6이다. 숫자로만 구성되어 있는지 확인해주는 함수 만들기
// 만약 s가 a234면 false, 1234면 true
public class 문자열다루기기본 {
    public static boolean solution(String s) {
        boolean answer = true;

        if (s.length() != 4 && s.length()!=6){
            answer = false;
        }

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c<'1' || c>'9'){
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String a = "a1234";
        System.out.println(solution("a234"));
    }
}
