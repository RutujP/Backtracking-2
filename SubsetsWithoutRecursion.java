
// Time Complexity : O(2*N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/*Approach
1) Can be asked by major companies
2) in this we use 2 lists main res list and copylist
3)add empty list in main res list
       res.add(new ArrayList<>());
4)we choose every num and get the size of res list
5) then we iterate over till the size and keep adding elements in the temp list
List<Integer> temp = new ArrayList<>(res.get(i));
-> we get the temp list which was added in the res list. 
then we add another element to the same list, thus can be done without using recursion.
*/

import java.util.*;
class SubsetsWithoutRecursion {
    
    
    public List<List<Integer>> subsets(int[] nums) {
        
        
       List<List<Integer>> res = new ArrayList<>();
        if(nums==null || nums.length==0)
        {
            return res;
        }
       
        // add empty list in main res list
       res.add(new ArrayList<>());
       for(int num:nums)
       {
           int size = res.size();
           for(int i=0;i<size;i++)
           {
               List<Integer> temp = new ArrayList<>(res.get(i));
               temp.add(num);
               res.add(temp);
               
               
           }
       }
    
        
        return res;
    }
    
    
   

}