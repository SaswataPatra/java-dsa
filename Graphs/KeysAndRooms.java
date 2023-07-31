package Graphs;
import java.util.*;
public class KeysAndRooms {
    //USING DFS
    public boolean canVisitAllRoomsDFS(List<List<Integer>> rooms) {
        boolean visited[] = new boolean[rooms.size()];
        dfs(rooms,0,visited);
        for(int i=0;i<rooms.size(); i++){
            if(!visited[i]) return false;
        }
        return true;
    }
    
    public void dfs(List<List<Integer>> rooms, int sv, boolean[] visited){
        visited[sv] = true;
        
        for(int i : rooms.get(sv)){
            if(!visited[i]){
                dfs(rooms,i,visited);
            }
        }
    }

    //USING BFS
    public boolean canVisitAllRoomsBFS(List<List<Integer>> rooms) {
        boolean visited[] = new boolean[rooms.size()];
        bfs(rooms,0,visited);
        for(int i=0;i<rooms.size(); i++){
            if(!visited[i]) return false;
        }
        return true;
    }
    
    public void bfs(List<List<Integer>> rooms, int sv, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        
        q.add(sv);
        visited[sv] = true;
        while(!q.isEmpty()){
            int front = q.poll();
            for(int i : rooms.get(front)){
                if(!visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
