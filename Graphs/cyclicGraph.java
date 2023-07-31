package Graphs;

import java.util.ArrayList;

public class cyclicGraph {
    public boolean isCyclic(ArrayList<ArrayList<Integer>> adj,int V){
        boolean visited[] = new boolean[V];
        for(int i =0;i<V;i++){
            if(!visited[i]){
                if(dfs(adj,i,visited,-1)) return true;
            }
        }
        return false;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, int sv, boolean visited[], int parent){
        visited[sv] = true;

        for(int v: adj.get(sv)){
            if(!visited[v]){
                if(dfs(adj,v,visited,sv)) return true;
            }else if(v!=parent){
                return true;
            }
        }
        return false;
    }
}
