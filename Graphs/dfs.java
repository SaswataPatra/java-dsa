package Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class dfs {

    public static void printBFSHelper(int[][]adj_mat,boolean visited[],int sv){
        Queue<Integer> q = new LinkedList<>();

        q.add(sv);
        visited[sv] = true;

        while(!q.isEmpty()){
            int front = q.poll();
            System.out.println(front);
            for(int i=0;i<adj_mat.length;i++){
                if(adj_mat[front][i]==1&&visited[i]==false){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void printDFSHelper(int[][] adj_mat,boolean[] visited,int sv){
        System.out.println(sv);
        visited[sv] = true;

        for(int i =0; i<adj_mat.length;i++){
            if(visited[i]==false && adj_mat[sv][i]==1){
                printDFSHelper(adj_mat, visited, i);
            }
        }
    }
    public static void printBFS(int[][] adj_mat,int sv){
        int v = adj_mat.length;
        boolean visited[] = new boolean[v];

        for(int i=0;i<v;i++){
            if(visited[i]==false)
            printBFSHelper(adj_mat,visited,i);
        }
    }

    public static void printDFS(int[][] adj_mat,int sv){
        int v = adj_mat.length;
        boolean visited[] = new boolean[v];

        for(int i=0;i<v;i++){
            if(visited[i]==false)
            printDFSHelper(adj_mat,visited,i);
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertex");
        int v = sc.nextInt();
        System.out.println("Enter number of edges");
        int e = sc.nextInt();

        int adj_mat[][] = new int[v][v];

        for(int i=0;i<e;i++){
            int sv = sc.nextInt();
            int ev = sc.nextInt();

            adj_mat[sv][ev] = 1;
            adj_mat[ev][sv] = 1;
        }
        System.out.println("DFS :-");
        printDFS(adj_mat,0);
        System.out.println("BFS :-");
        printBFS(adj_mat,0);
    }
}
