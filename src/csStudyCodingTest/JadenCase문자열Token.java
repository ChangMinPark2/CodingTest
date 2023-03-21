package csStudyCodingTest;

import java.util.StringTokenizer;

public class JadenCase문자열Token {
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder(); //스트링 빌더 생성 (문자열 붙히기용) ->메모리 문제때문에 빌더 사용 자주함. String끼리 붙이는경우
        StringTokenizer stringTokenizer = new StringTokenizer(s, " ", true);
        //StringTokenizer 문자열 s를 delim(" ")으로 분리시키는데, delim까지 토큰으로 포함한다.(true)이기 때문에

        while (stringTokenizer.hasMoreTokens()){ //hasMoreTokens -> 다음 토큰이 있는지 확인 후 있다면 다음 토큰을 가져온다. 반복문으로 다 가져오겟죠
            String str = stringTokenizer.nextToken(); // 다음의 토큰 반환, String형으로 ex) for Exam -> 처음에 (for"이거까지")반환

            if(str.startsWith(" ")) { // " "로 시작한다면.
                answer.append(str); //answer과 str을 붙이고
                continue; //계속하라.
            }
            // " "로 시작 안하면 처음에 While문은 여기부터 들어오겠죠
            answer.append((str.charAt(0)+"").toUpperCase()); //첫번째 문자 for -> f를 대문자로 바꾸기. str.substring(0, 1)-> 도 똑같을것 같습니다.
            answer.append(str.substring(1).toLowerCase()); //or -> 소문자로 바꾸기
        }

        return answer.toString(); //answer String형으로 반환해용 ~
    }

    public static void main(String[] args) {
        System.out.println(solution("HI EddssadQQQ"));
    }

}
