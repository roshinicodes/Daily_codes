//https://www.geeksforgeeks.org/problems/factorial5739/1
class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        if(n==0 || n==1)
        {
            return n;
        }
        return n*factorial(n-1);
    }
}
