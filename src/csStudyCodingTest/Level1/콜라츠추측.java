package csStudyCodingTest.Level1;

        /*1-1. 입력된 수가 짝수라면 2로 나눕니다.
        1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
        2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.*/
//500번 반복하면 -1 리턴 , 1이면 0
public class 콜라츠추측 {
    public int solution(long num) {
        int answer = 0;

        while(num != 1) {
            if(num % 2 == 0)
                num /= 2;
            else
                num = num * 3 + 1;
            answer++;

            if(answer >= 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        콜라츠추측 test = new 콜라츠추측();
        System.out.println(test.solution(6));
    }
}
