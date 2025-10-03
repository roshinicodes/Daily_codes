//https://www.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1
class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n=mat.length;
        
        //step1:Transpose
        
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        
        //reverse of ecah row after tarnspose gives 90* rotatation of arrays
        
        for(int i=0;i<n;i++)
        {
            int left=0; int right=n-1;
            
            while(left<right)
            {
                int temp=mat[left][i];
                mat[left][i]=mat[right][i];
                mat[right][i]=temp;
                
                left++;
                right--;
            }
        }
        
        
    }
}