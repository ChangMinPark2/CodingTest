package csStudyCodingTest.코딩테스트입문;

public class 가까운수 {
    public static int solution(int[] array, int n) {

        int answer = 0;
        int[] a = new int[array.length];
        // pass
        for(int i = 0; i < array.length; i++){
            a[i] = Math.abs(n - array[i]);
        }

        answer = a[0];
        int index = 0;

        for(int i = 1; i < a.length; i++){
            //같은경우
            if(answer == a[i]){
                if(array[index] < array[i]){
                    answer = a[index];
                } else if (array[index] > array[i]){
                    answer = a[i];
                    index = i;
                }

            } else if(a[i] < answer){
                answer = a[i];
                index = i;
            }
        }

        return array[index];
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        System.out.println(solution(a, 7));
    }
}
