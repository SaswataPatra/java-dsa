package Graphs;

public class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int source = image[sr][sc];
        if (newColor == source)
            return image;

        dfs(image, sr, sc, newColor, source);
        return image;

    }

    public static void dfs(int[][] image, int i, int j, int newColor, int oldColor) {
        if (i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] != oldColor) {
            return;
        }
        image[i][j] = newColor;
        dfs(image, i + 1, j, newColor, oldColor);
        dfs(image, i - 1, j, newColor, oldColor);
        dfs(image, i, j + 1, newColor, oldColor);
        dfs(image, i, j - 1, newColor, oldColor);
    }

    public static void main(String[] args) {
        int image[][] = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
        int sr = 1, sc = 1, newColor = 2;
        System.out.println(floodFill(image, sr, sc, newColor));
    }
}
