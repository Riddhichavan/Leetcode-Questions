class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<Integer>();
                int r_start = 0, c_start = 0, r_end = matrix.length-1, c_end = matrix[0].length-1;
        int d = 0;
        while(c_start<=c_end && r_start<=r_end){
            if(d==0){
                for(int i = c_start; i<=c_end; i++){
                ans.add(matrix[r_start][i]);
                }
                r_start++;
                d++;
            }
            
            else if(d==1){
                for(int i = r_start; i<=r_end; i++){
                ans.add(matrix[i][c_end]);
                }
                c_end--;
                d++;
            }
            
            else if(d==2){
                for(int i = c_end; i>=c_start; i--){
                ans.add(matrix[r_end][i]);
                }
                r_end--;
                d++;
            }
            
        
            else if(d==3){
                for(int i=r_end; i>=r_start; i--){
                ans.add(matrix[i][c_start]);
                }   
                c_start++;
                d=0;
            }
        }
        return ans;
    }
}

