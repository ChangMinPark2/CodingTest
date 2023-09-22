package csStudyCodingTest.코딩테스트입문;

public class 이진수더하기 {
    public String solution(String bin1, String bin2) {
        String answer = "";

        int a1 = Integer.parseInt(bin1, 2);
        int a2 = Integer.parseInt(bin2, 2);

        answer = Integer.toBinaryString(a1 + a2);
        return answer;
    }
}
