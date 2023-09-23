package csStudyCodingTest.코딩테스트입문;

public class 문자열계산하기 {
    public int solution(String my_string) {

        String[] str = my_string.split(" ");

        int answer = Integer.parseInt(str[0]);
        // 0 1 2 / 3 4 5 / 6 7 8// 크기는 9
        for (int i = 1; i < str.length - 1; i++) {
            if (str[i].equals("+")) {
                answer += Integer.parseInt(str[i + 1]);
            } else if (str[i].equals("-")) {
                answer -= Integer.parseInt(str[i + 1]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int a = 10;
        a += 3 - 2;
        System.out.println(a);
    }
}
