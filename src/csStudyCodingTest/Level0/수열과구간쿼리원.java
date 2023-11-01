package csStudyCodingTest.Level0;

public class 수열과구간쿼리원 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];

        for(int i = 0; i < queries.length; i++){
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                arr[j]++;
            }
        }
        return arr;
    }
}
