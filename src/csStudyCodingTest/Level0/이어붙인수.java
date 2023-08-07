package csStudyCodingTest.Level0;

public class 이어붙인수 {
    public static int solution(int[] num_list) {
        int answer = 0;

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for(int i = 0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                a.append(String.valueOf(num_list[i]));
            } else b.append(String.valueOf(num_list[i]));
        }
        answer = Integer.parseInt(a.toString()) + Integer.parseInt(b.toString());
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 2, 1};
        System.out.println(solution(a));
    }
}
