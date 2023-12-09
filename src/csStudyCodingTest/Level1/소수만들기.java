package csStudyCodingTest.Level1;

public class 소수만들기 {

    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k]; //값을 담아
                    if (sosu(num)) //소수가 맞을 경우
                        answer++;
                }
            }

        }
        return answer;
    }

    private boolean sosu(int n) {
        int count = 0;
        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 1 ? true : false;
    }
}
