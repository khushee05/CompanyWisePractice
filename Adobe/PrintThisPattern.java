// { Driver Code Starts
//Initial Template for Java//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N =sc.nextInt();
		
            Solution ob = new Solution();
         
            ob.printPattern(N);
        }  
    }
}
// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    void printPattern(int N){
        int n = 2*N - 1;
       
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n ; j++){
               int dist = Math.max(Math.abs(N - i), Math.abs(N - j));
               System.out.print( dist + 1);
            }
            System.out.println();
        }
    }
}
