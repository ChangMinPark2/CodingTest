package csStudyCodingTest.프로그래머스_3장_배열;

/**
 * 밑변의 크기와 높이가 n인 삼각형 -> 맨 위 꼭짓점부터 반 시계 방향으로 달팽이 채우기를 한 후,
 * 첫 행부터 마지막 행까지 모두 순서대로 합친 새로운 배열을 return하기.
 * 굳이 문제의 그림을 그대로 담으려고 하지 말고 2차원 배열에서 다루기 쉽게 저장한다.
 * 문제풀이흐름
 * 1. n * n 2차원 배열 선언
 * 2. 숫자를 채울 현재 위치를 (0, 0)으로 설정
 * 3. 방향에 따라 이동할 수 없을 때까지 반복하면서 숫자 채우기
 */
public class 삼각달팽이 {
    public int[] solution(int n) {
        int[] answer = {};
        int[][] triangle = new int[n][n];
        int v = 1;
        int x = 0;
        int y = 0;

        while (true){

            //아래로이동 -> (열 변화)
            while (true){
                triangle[y][x] = v++;

                if (y + 1 == n || triangle[y + 1][x] != 0) break;
                y += 1;
            }
            if (x + 1 == n || triangle[y][x+1] !=0) break;
            x += 1;

            //오른쪽으로 이동 -> (행 변화)
            while (true) {
                triangle[y][x] = v++;
                if (x + 1 == n || triangle[y][x + 1] != 0) break;
                x += 1;
            }
            if (triangle[y - 1][x - 1] != 0) break;
            x -= 1;
            y -= 1;

            //왼쪽 위로 이동 -> (열 변화)
            while (true){
                triangle[y][x] = v++;
                if (triangle[y - 1][x - 1] != 0) break;
                x -= 1;
                y -= 1;
            }
            if (y + 1 == n || triangle[y + 1][x] != 0) break;
            y += 1;

        }

        answer = new int[v - 1];
        int index = 0;

        for (int i = 0; i< n; i++){
            for (int j = 0; j <= i; j ++){
                answer[index++] = triangle[i][j];
            }
        }

        return answer;
    }
}
