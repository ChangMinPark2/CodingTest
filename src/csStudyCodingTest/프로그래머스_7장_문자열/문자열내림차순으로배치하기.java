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

    public String solution2(String s) {
        return s.chars()
                .boxed()
                .sorted((o1, o2) -> o2 - o1)
                .collect(StringBuilder::new, //StringBuilder 선언
                        StringBuilder::appendCodePoint, //	유니코드 코드 포인트를 덧붙입니다.
                        StringBuilder::append)
                .toString();
    }
}
