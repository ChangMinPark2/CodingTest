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
        bfs(maps);

        return count;
    }

    static void bfs(int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] repo = queue.remove();
            int a = repo[0];
            int b = repo[1];
            count = repo[2];
            if (a == n - 1 && b == m - 1) {
                break;
            }

            for (int i = 0; i < 4; i++) {
                int x = b + dx[i];
                int y = a + dy[i]; //i = 1일때 내려감.

                if (isCheck(y, x) && !visited[y][x] && maps[y][x] == 1) {
                    System.out.println(i);
                    visited[y][x] = true;
                    queue.add(new int[]{y, x, count + 1});
                }
            }
        }
    }

    private static boolean isCheck(int x, int y) { //n이 행 -> y축
//        return X >= 0 && X < n && Y >= 0 && Y < m;
        return x >= 0 && x < m && y >= 0 && y < n;
    }


    public static void main(String[] args) {
        int[][] maps = {
                {1, 0, 0},
                {1, 0, 0},
                {1, 0, 0}
//                {1, 0, 1, 1, 1},
//                {1, 0, 1, 0, 1},
//                {1, 0, 1, 1, 1},
//                {1, 1, 1, 0, 1},
//                {0, 0, 0, 0, 1}
        };

        System.out.println(solution(maps));
    }
}
