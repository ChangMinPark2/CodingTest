package csStudyCodingTest.Level0;

public class 정사각형으로만들기 {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        if (arr[0].length > arr.length) {
            answer = new int[arr[0].length][arr[0].length];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++){
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        }

        if (arr[0].length < arr.length) {
            answer = new int[arr.length][arr.length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++){
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        }

        return arr;
    }

    public int[][] solution2(int[][] arr) {
        int max = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[max][max];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }

        return answer;
    }
}
