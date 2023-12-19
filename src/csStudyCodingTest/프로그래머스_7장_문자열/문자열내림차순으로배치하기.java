package csStudyCodingTest.프로그래머스_7장_문자열;

public class 문자열내림차순으로배치하기 {
    public String solution(String s) {
        return s.chars()
                .boxed()
                .sorted((o1, o2) -> o2 - o1)
                .collect(StringBuilder::new,
                         StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }
}
