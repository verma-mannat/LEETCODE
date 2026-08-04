class Solution {
    public int countNegatives(int[][] grid) {
        //hoga ye?//kro starttt
        int n = grid[0].length;
        int m = grid.length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = n-1; j >= 0; j--) {
                if (grid[i][j] >= 0) {
                    break;
                }
                count++;
            }
        }
        return count;
    }
}
