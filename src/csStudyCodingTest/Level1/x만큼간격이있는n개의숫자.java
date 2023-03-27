package csStudyCodingTest.Level1;

public class x만큼간격이있는n개의숫자 {
    public static int[] solution(int x, int n) {
        int[] answer = new int[n];
        int repo = x;

        for(int i = 0; i < answer.length; i++ ){
            answer[i] = repo;
            repo +=x;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.print(solution(2,5));
    }
}
