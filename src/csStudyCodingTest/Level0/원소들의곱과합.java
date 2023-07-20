package csStudyCodingTest.Level0;

public class 원소들의곱과합 {
    public int solution(int[] num_list) {
        int sum = 0;
        int odd = 1;
        for (int i : num_list){
            sum += i;
            odd *= i;
        }
       return odd < (sum * sum) ? 1 : 0;
    }
}
