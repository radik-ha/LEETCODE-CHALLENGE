/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.*/

import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> h = new HashSet<>();
        HashSet <Integer> h1 = new HashSet<>();
        for(int num:nums1)
        {
            h.add(num);
        }
        for(int num:nums2)
        {
            if(h.contains(num))
            {
                h1.add(num);
            }
        }

        int[] result = new int[h1.size()];
        {
            int i=0;
            for(int val:h1)
            {
                result[i] = val;
                i++;
            }
        }
        return result;
    }
}

class IntersectLeet
{
public static void main(String args[])
{
int nums1[] = {1,2,3,4};
int nums2[] = {3,5,6};
Solution o = new Solution();
int[] result = o.intersection(nums1,nums2);
System.out.println(Arrays.toString(result));
}
}
/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.*/

import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> h = new HashSet<>();
        HashSet <Integer> h1 = new HashSet<>();
        for(int num:nums1)
        {
            h.add(num);
        }
        for(int num:nums2)
        {
            if(h.contains(num))
            {
                h1.add(num);
            }
        }

        int[] result = new int[h1.size()];
        {
            int i=0;
            for(int val:h1)
            {
                result[i] = val;
                i++;
            }
        }
        return result;
    }
}

class IntersectLeet
{
public static void main(String args[])
{
int nums1[] = {1,2,3,4};
int nums2[] = {3,5,6};
Solution o = new Solution();
int[] result = o.intersection(nums1,nums2);
System.out.println(Arrays.toString(result));
}
}