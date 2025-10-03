//https://www.geeksforgeeks.org/problems/search-in-a-matrix17201720/1
class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int n=mat.length;
        int m=mat[0].length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==x)
                {
                    return true ;
                }
            }
        }
        return false;
    
    }
}