package Graphs;

public class wordSearch {
    public static boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j =0; j<board[0].length; j++){
                if( board[i][j]==word.charAt(0)&&dfs(board,word,0,i,j)) return true;
            }
        }
        return false;
    }
    
    public static boolean dfs(char[][]board, String word,int count, int i , int j){
        if (count == word.length()) return true;
        if (i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(count)){
            return false;
        }
        char tmp = board[i][j];
        board[i][j] = '#';
        
boolean found = dfs(board,word,count+1, i+1, j) || dfs(board,word,count+1, i, j+1) || dfs(board,word,count+1, i-1, j) ||                                                                                            dfs(board,word,count+1, i, j-1);
        board[i][j] = tmp;// simply a brilliant line 
                            // it doesnt do shit if you are working with one component but you need to restore all the
                            // '#' back to their original states before working into the next component
        return found;
    }

    public static void main(String[] args) {
        char mat[][] = { { 'A','B','C','E' }, {'S','F','C','S'}, {'A','D','E','E'} };
        String word = "ABCCED";
        System.out.println(exist(mat,word));
    }
}
