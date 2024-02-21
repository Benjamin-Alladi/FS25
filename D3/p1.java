/*
Input 'n', an array of length ‘n’ and a number ‘k’. 
Find the maximum sum of ‘k’ consecutive elements inside the array.

Sample Test Cases:

Test Case-1
input=4
2 3 4 5
2
output=9

Test Case-2
input=9
1 4 2 10 2 3 1 0 20
4
output=24
*/

import java.util.*;

class NaiveApproach
{
    static int getMaxSum(int[] a, int k, int n)
    {
        int ms=-1;
        for(int i=0;i<=n-k;i++)
        {
            int s=0;
            for(int j=0;j<k;j++)
            {
                s+=a[i+j];
            }
            ms= Math.max(ms,s);
        }
        return ms;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] a= new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k= sc.nextInt();
        System.out.println(getMaxSum(a,k,n));
    }
}