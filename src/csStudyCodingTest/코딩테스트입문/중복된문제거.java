package csStudyCodingTest.코딩테스트입문;

//1. 배열로 저장한다.
//2. 이중 반복문을 사용하여 중복을 검사해준다.
//3. StringBuilder를 통하여 중복하지 않는다면 추가한다.

public class 중복된문제거 {
    public static String solution(String my_string) {
        String answer = "";

        String[] str = my_string.split("");

        answer += str[0];

        for(int i = 1; i < my_string.length(); i++){
            if (answer.contains(str[i])){

            } else {
                answer += str[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("people"));
    }

}
