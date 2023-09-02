package csStudyCodingTest.코딩테스트입문;

public class 숫자찾기 {
    public static int solution(int num, int k) {
        int answer = -1;
        String str = String.valueOf(num);

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == k + '0'){
                answer = i+1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(29183, 1));
    }
}
