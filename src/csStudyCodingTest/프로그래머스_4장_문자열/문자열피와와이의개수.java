package csStudyCodingTest.프로그래머스_4장_문자열;
/**
 문제 풀이 흐름
 1. 문자열을 모두 소문 or 대문자로 변환

 **/
public class 문자열피와와이의개수 {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();

        int ps = s.length() - s.replace("p", "").length();
        int ys = s.length() - s.replace("y", "").length();

        return ps==ys;
    }

}
