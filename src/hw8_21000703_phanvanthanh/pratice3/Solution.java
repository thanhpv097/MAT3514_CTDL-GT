package hw8_21000703_phanvanthanh.pratice3;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[V];

        dfs(adj, vis, ans, 0);

        return ans;
    }

    void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> ans, int curr){
        ans.add(curr);
        vis[curr] = true;

        for(Integer temp: adj.get(curr)){
            if(vis[temp] != true)
                dfs(adj, vis, ans, temp);
        }
    }
}