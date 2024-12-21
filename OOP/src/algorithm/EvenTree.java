package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvenTree {

    static int cutCount = 0;

    static int evenForest(int t_nodes, int t_edges, List<Integer> t_from, List<Integer> t_to) {

        List<List<Integer>> tree = new ArrayList<>();

        for(int i=0; i<=t_nodes; i++) {
            tree.add(new ArrayList<>());
        }

        for(int i=0; i< t_edges; i++) {
            int u = t_from.get(i);
            int v = t_to.get(i);
            tree.get(u).add(v);
            tree.get(v).add(u);
        }


        return dfs(tree, 1, -1);
    }

    static int dfs(List<List<Integer>> tree, int node, int parent) {
        int subtreeSize = 1;
        for(int child : tree.get(node)) {
            if(child != parent) {
                subtreeSize += dfs(tree, child, node);
            }
        }
        if(subtreeSize % 2 == 0 && parent != -1) {
            cutCount++;
        }

        return subtreeSize;
    }


    public static void main(String[] args) {
        List<Integer> t_from = List.of(1, 1, 3, 2, 1, 2, 6, 8, 8);
        List<Integer> t_to = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10);
        evenForest(10, 9, t_from, t_to);
        System.out.println("we should cut tree : " + cutCount);
    }
}
