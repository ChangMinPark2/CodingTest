package csStudyCodingTest.Level0;

public class 일로만들기 {

    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0; i < num_list.length; i++){
            answer += isOne(num_list[i]);
        }
        return answer;
    }

    private int isOne(int n){

        int sum = 0;

        while(n != 1){

            if(n % 2 == 0){
                n = n / 2;
                sum++;
            } else if(n % 2 == 1){
                n = (n - 1) / 2;
                sum++;
            }
        }
        return sum;
    }
}
