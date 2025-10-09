//https://www.geeksforgeeks.org/problems/minimum-number-in-a-sorted-rotated-array-1587115620/1?page=1&category=Binary%20Search&sortBy=submissions
class Solution {
    // Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high) {
        // Your code here
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[high])
            {
                low=mid+1;
            }
            else
            {
                high=mid;
            }
            
        }
        return arr[low];
        
    }
}