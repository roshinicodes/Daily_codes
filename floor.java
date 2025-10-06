//https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int floor_index=-1;
        int low=0;
        int high=arr.length-1;
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            
            if(arr[mid]==x)
            {
                floor_index=mid;
                low=mid+1;
                
            }
            else if(arr[mid]<x)
            {
                floor_index=mid;
                low=mid+1;
                
            }
            else
            {
                high=mid-1;
            }
        }
        return floor_index;
        
    }
}
