package Graphs;

import java.util.*;
public class wordSearch2 {
    public class TrieNode{
        public boolean isWord = false;
        public TrieNode[] child = new TrieNode[26];
    }
    
    TrieNode root = new TrieNode();
    boolean[][] flag;
    public List<String> findWords(char[][] board, String[] words) {
        flag = new boolean[board.length][board[0].length];
        HashSet<String> result = new HashSet<>();
        createTrie(words);
        for(int i=0; i<board.length; i++){
            for(int j =0;j<board[0].length; j++){
                if(root.child[board[i][j]-'a']!=null) dfs(board,i,j,root,"",result);
            }
        }
        return new ArrayList<>(result);
        
    }
    
    public void createTrie(String[] words){
        for(String w : words){
            TrieNode node = root;
            for(char c : w.toCharArray()){
                int i = c - 'a';
                if(node.child[i]==null) {
                    node.child[i] = new TrieNode();
                }
                node = node.child[i];
            }
        }
    }
    
    public void dfs(char[][] board, int i, int j, TrieNode node, String word, Set<String> result){
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || flag[i][j] || node.child[board[i][j]-'a']==null){
            return;
        }
        flag[i][j] = true;
        node = node.child[board[i][j]-'a'];
        if (node.isWord) {
            result.add(word+board[i][j]);
        }
        dfs(board,i+1,j,node,word+board[i][j],result);
        dfs(board,i,j+1,node,word+board[i][j],result);
        dfs(board,i-1,j,node,word+board[i][j],result);
        dfs(board,i,j-1,node,word+board[i][j],result);
    }
}