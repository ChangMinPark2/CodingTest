package csStudyCodingTest.Level2;
import java.util.*;
//행의 크기 N -> y축
//열의 크기 M -> X축
public class 게임맵최단거리 {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static boolean[][] visited;
    static int n, m, count;

    public static int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];
        bfs(0, 0, maps);

        return !visited[n - 1][m - 1] ? -1 : count;

    }

    static void bfs(int a, int b, int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] repo = queue.remove();
            a = repo[0];
            b = repo[1];
            count = repo[2];
            if (a == n - 1 && b == m - 1) break;

            for (int i = 0; i < 4; i++) {
                int X = a + dx[i];
                int Y = b + dy[i];

                if (isCheck(X, Y) && !visited[X][Y] && maps[X][Y] == 1) {
                    visited[X][Y] = true;
                    queue.add(new int[]{X, Y, count + 1});
                }
            }
        }
    }
    private static boolean isCheck(int X, int Y) {
        return X >= 0 && X < n && Y >= 0 && Y < m;
    }



    public static void main(String[] args) {
        int[][] maps = {
//                {1, 0, 0},
//                {1, 0, 0},
//                {1, 0, 0}
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}
        };

        System.out.println(solution(maps));
    }
}
