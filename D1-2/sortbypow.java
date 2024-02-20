/*
The power of an integer x is defined as the number of steps needed to transform 
x into 1 using the following steps:

if x is even then x = x / 2
if x is odd then x = 3 * x + 1
For example, the power of x = 3 is 7 because 3 needs 7 steps to become 1 
(3 --> 10 --> 5 --> 16 --> 8 --> 4 --> 2 --> 1).

Given three integers lo, hi and k. The task is to sort all integers in the 
interval [lo, hi] by the power value in ascending order, if two or more integers 
have the same power value sort them by ascending order.

Return the kth integer in the range [lo, hi] sorted by the power value.

Notice that for any integer x (lo <= x <= hi) it is guaranteed that x will 
transform into 1 using these steps and that the power of x is will fit in a 
32-bit signed integer.

Example 1:
Input: lo = 12, hi = 15, k = 2
Output: 13
Explanation: The power of 12 is 9 (12 --> 6 --> 3 --> 10 --> 5 --> 16 --> 
                                                        8 --> 4 --> 2 --> 1)
The power of 13 is 9
The power of 14 is 17
The power of 15 is 17
The interval sorted by the power value [12,13,14,15]. For k = 2 answer is the 
second element which is 13.
Notice that 12 and 13 have the same power value and we sorted them in ascending 
order. Same for 14 and 15.
Example 2:

Input: lo = 7, hi = 11, k = 4
Output: 7
Explanation: The power array corresponding to the interval [7, 8, 9, 10, 11] is 
[16, 3, 19, 6, 14].
The interval sorted by power is [8, 10, 11, 7, 9].
The fourth number in the sorted array is 7.
 

Constraints:
1 <= lo <= hi <= 1000
1 <= k <= hi - lo + 1
*/


import java.util.*;

class SortByPower
{
    static int getPow(int x)
    {
        int c=0;
        while(x!=1)
        {
            if(x%2==0)
            {
                x/=2;
            }
            else
            {
                x = 3 * x + 1;
            }
            c++;
        }
        
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int l=sc.nextInt(), h=sc.nextInt(), k=sc.nextInt();
        
        int[] a= new int[h-l+1];
        int[] r= new int[h-l+1];
        int n=h-l+1;
        
        for(int i=0;i<a.length;i++)
        {
            a[i]= l+i;
            r[i]= getPow(a[i]);
        }
        
        for(int i=0;i<a.length;i++)
        {
            int min= r[i];
            int minInd=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(r[j]<min)
                {
                    min=r[j];
                    minInd= j;
                }
            }
            
            if(minInd!=i)
            {
                int t=r[i];
                r[i]=r[minInd];
                r[minInd]=t;
                
                t=a[i];
                a[i]=a[minInd];
                a[minInd]=t;
            }
        }
        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(r));
        System.out.println(a[k-1]);
    }
}
