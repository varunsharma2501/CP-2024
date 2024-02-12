import java.util.ArrayList;
import java.util.Scanner;

public class TreeDiameter {

    static int diameter(ArrayList<Integer>[] adj, int curNode, int parent, int[] ans) {
        if (adj[curNode].size() == 1)
            return 1;

        int h1 = 0;
        int h2 = Integer.MIN_VALUE;
        for (int it : adj[curNode]) {
            if (parent != it) {
                int k = diameter(adj, it, curNode, ans);
                if (h1 <= k) {
                    h2 = h1;
                    h1 = k;
                } else if (h2 <= k) {
                    h2 = k;
                }
            }
        }
        ans[0] = Math.max(ans[0], 1 + h1 + h2);
        return 1 + Math.max(h1, h2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer>[] adj = new ArrayList[n + 1];

        // Initializing the adjacency list
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        // Reading edges and constructing the tree
        for (int i = 1; i < n; i++) {
            int k1 = scanner.nextInt();
            int k2 = scanner.nextInt();
            adj[k1].add(k2);
            adj[k2].add(k1);
        }

        // Adding a dummy edge to make the tree connected
        adj[1].add(0);

        int[] ans = {0};
        diameter(adj, 1, 0, ans);

        // Adjusting the output based on whether the input tree has only one node
        if (n == 1)
            System.out.println(ans[0]);
        else
            System.out.println(ans[0] - 1);
    }
}
