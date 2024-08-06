class neighborSum {
    int[][] mat;
    HashMap<Integer, Location> map =  new HashMap<>();
    public neighborSum(int[][] grid) {
        mat = new int[grid.length][grid.length];
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid.length;j++){
            map.put(grid[i][j], new Location(i,j));
            mat[i][j] = grid[i][j];
            }
    }
    
    public int adjacentSum(int value) {
        Location l = map.get(value);
        return ((l.row-1>=0)?mat[l.row-1][l.col]:0) + 
               ((l.row+1<mat.length)?mat[l.row+1][l.col]:0) +
               ((l.col-1>=0)?mat[l.row][l.col-1]:0 )+
               ((l.col+1<mat.length)?mat[l.row][l.col+1]:0); 
    }
    
    public int diagonalSum(int value) {
        Location l = map.get(value);
        return ((l.row-1>=0 && l.col-1>=0)?mat[l.row-1][l.col-1] :0)+ 
               ((l.row+1<mat.length && l.col-1>=0)?mat[l.row+1][l.col-1]:0 )+
               ((l.row+1<mat.length && l.col+1<mat.length)?mat[l.row+1][l.col+1]:0)+
               ((l.row-1>=0 && l.col+1<mat.length)?mat[l.row-1][l.col+1]:0); 
    }
}

class Location{

    int row;
    int col;

    public Location(int r, int c){
        this.row = r;
        this.col = c;
    }
}

/**
 * Your neighborSum object will be instantiated and called as such:
 * neighborSum obj = new neighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */