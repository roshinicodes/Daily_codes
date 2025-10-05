//https://www.geeksforgeeks.org/problems/implement-atoi/1?utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab&utm_source=geeksforgeeks
class Solution {
    public int myAtoi(String s) {
        // code here
        if(s==null || s.length()==0) return 0;
        
        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' ')
        {
            i++;
        }
        
        int sign=1;
        while(i<n &&(s.charAt(i)=='+'|| s.charAt(i)=='-'))
        {
            if(s.charAt(i)=='+')
            {
                sign=1;
            }
            if(s.charAt(i)=='-')
            {
                sign=-1;
            }
            i++;
        }
        
        long num=0;
        while(i<n && Character.isDigit(s.charAt(i)))
        {
            int digit=s.charAt(i)-'0';
            num=num*10+digit;
               // 4. Overflow handling
            if (sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }
        
   
        return (int)(sign*num);


        
        
        
        
    }
}