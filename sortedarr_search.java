//https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1?page=1&category=Binary%20Search&sortBy=submissions
class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        int low=0;
        int high=arr.length-1;
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==k)
            {
                return true;
            }
            else if(arr[mid]<k)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        
        return false;
        
    }
}