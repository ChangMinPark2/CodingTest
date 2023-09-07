package csStudyCodingTest.Level0;

/**
 * 첫 번째 인덱스를 1이라고 함
 *
 */
public class 홀수대짝수 {
    public static int solution(int[] num_list) {
        int a = 0;
        int b = 0;
        for(int i = 0; i < num_list.length; i++){
            if (i % 2 == 0){
                a += num_list[i];
            } else b += num_list[i];
        }

        if (a > b){
            return a;
        } else if (a < b) {
            return b;
        } else return a;
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 6, 1, 7, 6};

        System.out.println(solution(a));
    }
}
