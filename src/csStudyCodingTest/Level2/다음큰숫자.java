package csStudyCodingTest.Level2;

/***
 * 조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
 * 조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
 * 조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
 */
public class 다음큰숫자 {
    public static int solution(int n) {
        int answer = 0;
        String binaryStr = Integer.toBinaryString(n);
        int origin = count(binaryStr);

        for (int i = n+1; i<1000000; i++){
            String binaryString = Integer.toBinaryString(i);
            if (origin == count(binaryString)){
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static int count(String a){
        int count = 0;
        for (int i = 0; i<a.length(); i++){
            if (a.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}
