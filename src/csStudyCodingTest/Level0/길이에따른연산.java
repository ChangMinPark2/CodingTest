package csStudyCodingTest.Level0;

public class 길이에따른연산 {
    public int solution(int[] num_list) {
        int answer = 0;
        if (num_list.length >= 11){
            for (int i : num_list){
                answer += i;
            }
        } else {
            answer = 1;
            for (int i : num_list){
                answer *= i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        길이에따른연산 a = new 길이에따른연산();
        int[] ac = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        System.out.println(a.solution(ac));
    }
}
