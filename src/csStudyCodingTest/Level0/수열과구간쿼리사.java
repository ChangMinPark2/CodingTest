package csStudyCodingTest.Level0;

public class 수열과구간쿼리사 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++)
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(j % queries[i][2] == 0)
                    arr[j]++;
            }
        return arr;
    }
}
