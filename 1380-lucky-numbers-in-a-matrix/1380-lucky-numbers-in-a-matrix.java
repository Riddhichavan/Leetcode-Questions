class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int[] minInRow = new int[matrix.length];
        int[] maxInCol = new int[matrix[0].length];
        for(int i = 0; i<matrix.length; i++){
            int rowMin = Integer.MAX_VALUE;
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]<rowMin){
                    rowMin = matrix[i][j];
                }
            }
            minInRow[i] = rowMin;
        }
                    
        for(int i = 0; i<matrix[0].length; i++){
            int ColMax = Integer.MIN_VALUE;
            for(int j = 0; j<matrix.length; j++){
                if(matrix[j][i]>ColMax){
                    ColMax = matrix[j][i];
                }
            }
            maxInCol[i] = ColMax;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i<minInRow.length; i++){
            for(int j = 0; j<maxInCol.length; j++){
                if(minInRow[i]==maxInCol[j]){
                    ans.add(minInRow[i]);
                }
            }
        }
        return ans;
    }
}
        