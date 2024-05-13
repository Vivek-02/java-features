package graphs;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    public static void main(String[] args) {
        int[][] edges = {{1, 2},{1, 3},{3, 2}};
        int e = 3;
        int v = 3;
        System.out.println(findNumberOfGoodComponent(e, v, edges));
    }

    public static int findNumberOfGoodComponent(int e, int v, int[][] grid) {
        // code here
        List<List<Integer>> adj = new ArrayList<>(v+1);

        for(int i=0;i<=v;i++) {
            adj.add(new ArrayList<>());
        }

        // Building adjacency matrix
        for(int i=0;i<grid.length;i++) {
            adj.get(grid[i][0]).add(grid[i][1]);
        }

        int ans = 0;
        int[] visited = new int[v+1];

        for(int i=1;i<=v;i++) {
            if(visited[i] == 0) {
                int[] vertices = {0};
                int[] edges = {0};

                dfs(i, edges, vertices, adj, visited);
                edges[0] /= 2;
                if(edges[0] == (vertices[0] * (vertices[0] - 1))/2)
                    ans++;
            }
        }

        return ans;
    }

    public static void dfs(int i, int[] edges, int[] vertices, List<List<Integer>> adj, int[] visited) {
        visited[i] = 1;

        vertices[0]++;
        edges[0] += adj.get(i).size();
        for(int to : adj.get(i)) {
            if(visited[to] == 0) {
                dfs(to, edges, vertices, adj, visited);
            }
        }
    }
}
