package csStudyCodingTest.Level2;
/*
* 주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다라는 정수론 정리가 있습니다(신가하다)
* */
public class 숫자의표현 {
    public int solution(int n) {
        int answer = 1;

        for(int i = 1; i <= n; i++){
            int sum = i;

            for(int j = i+1; j <= n; j++){
                sum += j;

                if(sum == n){
                    answer++;
                    break;
                }else if(sum > n){
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        숫자의표현 s = new 숫자의표현();
        System.out.println(s.solution(15));
    }


}
