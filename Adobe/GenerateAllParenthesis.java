// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        List<String> ans = new ArrayList<>();
        solve(ans,"",0,0,n);
        return ans;
    }
     public void solve(List<String> ans, String cur, int o, int c, int n){
         if(cur.length() == 2*n){
             ans.add(cur);
             return;
         }
         if(o<n){
             solve(ans,cur+"(", o+1,c,n);
         }
         if(c<o){
             solve(ans,cur+")",o,c+1,n);
         }
     }
}


