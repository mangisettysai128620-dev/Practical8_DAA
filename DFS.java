import java.util.*;

public class DFS {
    public static void dfs(List<List<Integer>> graph, int node, boolean[] visited) {
        // Mark the current node as visited and print it
        visited[node] = true;
        System.out.print(node + " ");

        // Recur for all adjacent vertices
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        // Create an adjacency list for 4 nodes (0 to 3)
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 4; i++) graph.add(new ArrayList<>());

        // Add edges: 0-1, 0-2, 1-2, 2-3
        graph.get(0).addAll(Arrays.asList(1, 2));
        graph.get(1).addAll(Arrays.asList(0, 2));
        graph.get(2).addAll(Arrays.asList(0, 1, 3));
        graph.get(3).add(2);

        System.out.print("DFS traversal: ");
        boolean[] visited = new boolean[graph.size()];
        dfs(graph, 0, visited);
    }
}
