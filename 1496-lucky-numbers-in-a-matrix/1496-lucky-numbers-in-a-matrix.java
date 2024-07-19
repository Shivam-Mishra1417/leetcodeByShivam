class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> lt = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int minv=matrix[i][0],minc=0;
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]<minv){
                    minv = matrix[i][j];
                    minc = j;
                }
            }
            int maxv = matrix[0][minc];
            for(int k=1;k<matrix.length;k++){
                if(matrix[k][minc]>maxv)
                    maxv = matrix[k][minc];
            }

            if(minv==maxv) lt.add(minv);

        }
        return lt;
    }
}