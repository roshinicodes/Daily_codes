//https://www.geeksforgeeks.org/problems/rotation4723/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int low=0;int high=arr.length-1;
        
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
        return low;
        
    }
}