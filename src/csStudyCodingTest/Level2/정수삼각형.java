package csStudyCodingTest.Level2;


public class 정수삼각형 {

    public static int solution(int[][] triangle) {
        int answer = 0;

        for(int i =1; i<triangle.length; i++){
            for(int j = 0; j < triangle[i].length; j++){
                if(j == 0){ // 맨 왼쪽의 경우
                    triangle[i][j] += triangle[i -1][j];
                }
                else if (j == i){ //맨 오른쪽의 경우
                    triangle[i][j] += triangle[i-1][j-1];
                }
                else{
                    triangle[i][j] += Math.max(triangle[i-1][j], triangle[i-1][j-1]);
                }
                     answer = Math.max(answer, triangle[i][j]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int [][] test = new int[][]{
                {7},
                {3, 8},
                {8, 1, 0},
                {2, 7, 4, 4},
                {4, 5, 2, 6, 5}
        };
        System.out.println(solution(test));
    }
}
