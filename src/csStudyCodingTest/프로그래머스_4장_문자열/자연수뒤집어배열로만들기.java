package csStudyCodingTest.프로그래머스_4장_문자열;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        int[] answer = {};

        String str = String.valueOf(n);
        String reversed = new StringBuilder(str).reverse().toString();
        char[] arr = reversed.toCharArray();

        answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            answer[i] = arr[i] = '0';
        }

        return answer;
    }
}
