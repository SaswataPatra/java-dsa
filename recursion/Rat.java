package recursion;


import java.util.*;
// 1 0 0 0 1 1 0 1 1 1 0 0 0 1 1 1
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();
            
                // for(int i[]:a){
                //     System.out.println(Arrays.toString(i) + " ");
                // }

            Sol obj = new Sol();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends
class Sol {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        System.out.println("hello");
        ArrayList<String> res = new ArrayList<>();
      
        if(m[n-1][n-1]==0) {
            res.add("-1");
            return res;
        }
        int visited[][] = new int[n][n];
        backtrack(m,n,res,new StringBuilder(),0,0,visited);
        return res;
    }
    public static void backtrack(int[][]m, int n, ArrayList<String> res, StringBuilder s, int row, int col,int[][] visited){
       
        if(row==n-1 && col == n-1) {
            res.add(new String(s));
            return;
        }else{
            visited[row][col] = 1;
        }
        if(row<n-1 && m[row+1][col]==1 && visited[row+1][col]==0) backtrack(m, n, res, s.append("D"), row+1, col, visited);
        if(row>0 && m[row-1][col]==1 && visited[row-1][col]==0) backtrack(m, n, res, s.append("U"), row-1, col, visited);
        if(col>0 && m[row][col-1]==1 && visited[row][col-1]==0) backtrack(m, n, res, s.append("L"), row, col-1, visited);
        if(col<n-1 && m[row][col+1]==1 && visited[row][col+1]==0) backtrack(m, n, res, s.append("R"), row, col+1, visited);
        visited[row][col] = 0;
        // s.deleteCharAt(s.length()-1);
    }
        public static char isSafe(int[][]m,int n,int row, int col){
            //left
            if(col>0 && m[row][col-1]==1) return 'L';
            //right
            if(col<n && m[row][col+1]==1) return 'R';
            //up
            if(row>0 && m[row-1][col]==1) return 'U';
            //down
            if(row<n && m[row+1][col]==1) return 'D';
            
            return 0;
        }
}