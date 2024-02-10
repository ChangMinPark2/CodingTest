package csStudyCodingTest.백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 트리 {
    static int node, root, count = 0;
    static boolean[] visited;
    static List<List<Integer>> tree = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        node = Integer.parseInt(br.readLine());
        visited = new boolean[node];

        for (int i = 0; i < node; i++) {
            tree.add(new ArrayList<>());
        }

        String[] repo = br.readLine().split(" ");

        for (int i = 0; i < node; i++) {
            if (Integer.parseInt(repo[i]) == -1) {
                root = i;
            } else tree.get(Integer.parseInt(repo[i])).add(i);
        }

        int delete = Integer.parseInt(br.readLine());
        deleteDfs(delete);
        dfs(root);
        System.out.println(count);

    }

    static void deleteDfs(int node) {
        visited[node] = true;

        if (tree.get(node).isEmpty()) return;

        for (int i : tree.get(node)) {
            if (!visited[i]) {
                visited[i] = true;
                deleteDfs(i);
            }
        }
    }

    static void dfs(int node) {
        int cnt = 0;
        if (visited[node]) return;

        for (int i : tree.get(node)) {
            if (!visited[i]) {
                dfs(i);
                cnt++;
            }
        }

        if (!visited[node] && cnt == 0) {
            count++;
        }
    }
}
