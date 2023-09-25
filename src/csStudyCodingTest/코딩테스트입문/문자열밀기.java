package csStudyCodingTest.코딩테스트입문;

public class 문자열밀기 {
    public static int solution(String A, String B) {
        int answer = 0;
        String copy = A;

        for (int i = 0; i < A.length(); i++) {
            if (copy.equals(B)) {
                return answer;
            }

            String a = copy.substring(copy.length() - 1);
            System.out.println(a);
            copy = a + copy.substring(0, copy.length() - 1);
            System.out.println(copy);
            answer++;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution("hello", "llohe"));
    }
}
