/*Alice has n balloons arranged on a rope. You are given a 0-indexed string 
colors where colors[i] is the color of the ith balloon.

Alice wants the rope to be colorful. She does not want two consecutive balloons 
to be of the same color, so she asks Bob for help. Bob can remove some balloons 
from the rope to make it colorful. You are given a 0-indexed integer array 
neededTime where neededTime[i] is the time (in seconds) that Bob needs to remove 
the ith balloon from the rope.
Return the minimum time Bob needs to make the rope colorful.

Example 1:
Input: abaac
1 2 3 4 5
Output: 3
Explanation: In the above image, 'a' is blue, 'b' is red, and 'c' is green.
Bob can remove the blue balloon at index 2. This takes 3 seconds.
There are no longer two consecutive balloons of the same color. Total time = 3.

Example 2:
Input: abc
1 2 3
Output: 0
Explanation: The rope is already colorful. Bob does not need to remove any 
balloons from the rope.

Example 3:
Input: aabaa
1 2 3 4 1
Output: 2
Explanation: Bob will remove the balloons at indices 0 and 4. Each balloons 
takes 1 second to remove.
There are no longer two consecutive balloons of the same color. 
Total time = 1 + 1 = 2.
 

Constraints:

n == colors.length == neededTime.length
1 <= n <= 105
1 <= neededTime[i] <= 104
colors contains only lowercase English letters.
*/

import java.util.*;

class colorBaloons
{
    static void getRes(String s, int[] a)
    {
        int c=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                c+= Math.min(a[i],a[i+1]);
            }
        }
        System.out.println(c);
    }
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        
        int[] a= new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            a[i]=sc.nextInt();
        }
        getRes(s,a);
    }
}