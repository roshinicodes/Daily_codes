//https://www.geeksforgeeks.org/problems/pascal-triangle0652/1?page=1&category=Recursion&difficulty=Easy&sortBy=submissions
class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> row=new ArrayList<>();
        long val=1;
        row.add(1);
        
        for(int k=1;k<n;k++)
        {
            val=val*(n-k)/k;
            row.add((int)val);
        }
         return row;
    }
   
    
}