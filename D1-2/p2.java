/*
Mr Shravan is given a word W, and W cosists of lowercase alphabets and '#'. 
Mr Shravan is allowed to replace the '#' with any one lowercase alphabet, 
such that the word W is a palindrome and it has to be the lexicographically
smallest among all the possible options.

Your task is to help Mr Sharavan to return the lexicographically smallest 
palindrome string among all the possible options. 
OR "invlaid" if it is not possible.

Input Format:
-------------
A String W, consists of lowercase letters and #.
Output Format:
--------------
A String result.


Sample Input-1:
---------------
r#d#v##er
Sample Output-1:
----------------
redavader

Sample Input-2:
---------------
r#d#v#cer
Sample Output-2:
----------------
invalid

*/
import java.util.*;

class lexiSmallestPalin
{
    public static void getRes(StringBuilder s)
    {
        int l=0;
        int h=s.length()-1;

        while(l<=h)
        {
            if(s.charAt(l)!=s.charAt(h))
            {
                if(s.charAt())
            }
        }

    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        StringBuilder sb= new StringBuilder(s);
        getRes(sb);
    }
}