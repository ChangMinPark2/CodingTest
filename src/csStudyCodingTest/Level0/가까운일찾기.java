package csStudyCodingTest.Level0;

public class 가까운일찾기 {

    public int solution(int[] arr, int idx) {
        int answer = -1;
        for(int i = idx; i < arr.length; i++){
            if(arr[i] == 1){
                answer = i;
                return answer;
            }
        }
        return answer;
    }
}
