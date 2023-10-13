package csStudyCodingTest.프로그래머스_4장_문자열;

public class 숫자문자열영단어 {
    public int solution(String s) {

        String[] repo = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        // s.length()를 하면 런타임 에러가 뜬다.
        for(int i = 0; i < repo.length; i++){
            s = s.replace(repo[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}
