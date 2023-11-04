class Solution {
    public int islandPerimeter(int[][] grid) {
        int ct=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                if(check(grid,i-1,j)) ct++;
                if(check(grid,i,j-1)) ct++;
                if(check(grid,i,j+1)) ct++;
                if(check(grid,i+1,j)) ct++;
                }
            }
        }
        return ct;
    }

    public boolean check(int[][] gd, int r, int c){
        if(r<0 || r>=gd.length) return true;
        if(c<0 || c>=gd[0].length) return true;
        return (gd[r][c]==0)?true:false;
    }
}