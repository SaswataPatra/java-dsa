package Graphs;

public class zeroOneMatrix {

    public int[][] updateMatrix(int[][] mat) {
        for(int i=0;i<mat.length;i++){
            for(int j =0;j<mat[0].length;i++){
                if (mat[i][j]==1){
                    int temp =dfs(mat, i, j);
                    mat[i][j] = temp;
                }
            }
        }
        return mat;
    }
    public int dfs(int[][]mat, int i, int j){
        if (i<0||j<0||i>=mat.length||j>=mat[0].length||mat[i][j]!=1){
            return 0;
        }else if ( mat[i][j]==0) return 1;

        
        mat[i][j] = Integer.min();
    }

    public static void main(String[] args) {
        int mat[][] = { { 0,0,0 }, {0,1,0}, {1,1,1} };
        for(int i=0;i<)
    }
}
