package csStudyCodingTest.Level0;

import java.util.Arrays;

public class 정수를나선형으로배치하기 {
    static int xStart, yStart = 0;
    static int xEnd, yEnd;
    static int count = 1;
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        xEnd = n;
        yEnd = n;
        while(count <= n * n) {
            right(answer);
            down(answer);
            left(answer);
            up(answer);
        }

        return answer;
    }

    private static void right(int[][] answer) {
        for(int i = xStart; i < xEnd; i++) {
            answer[yStart][i] = count++;
        }
        yStart++;
    }

    private static void down(int[][] answer) {
        for(int i = yStart; i < yEnd; i++) {
            answer[i][xEnd-1] = count++;
        }
        xEnd--;
    }

    private static void left(int[][] answer) {
        for(int i = xEnd - 1; i >= xStart; i--) {
            answer[yEnd - 1][i] = count++;
        }
        yEnd--;
    }

    private static void up(int[][] answer) {
        for(int i = yEnd - 1; i >= yStart; i--) {
            answer[i][xStart] = count++;
        }
        xStart++;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(4)));
    }

    int[] dy = {0,1,0,-1};
    int[] dx = {1,0,-1,0};

    public int[][] solution2(int n) {
        int[][] answer = new int[n][n];

        int y=0,x=0;
        int dir=0;

        for(int i=1; i<= n*n; i++){
            answer[y][x] = i;

            if( y+dy[dir] < 0 || y+dy[dir] >= n || x+dx[dir] < 0 || x+dx[dir] >= n
                    || answer[y+dy[dir]][x+dx[dir]] != 0){
                dir = (dir+1)%4;
            }

            y+= dy[dir];
            x+= dx[dir];
        }

        return answer;
    }
}
