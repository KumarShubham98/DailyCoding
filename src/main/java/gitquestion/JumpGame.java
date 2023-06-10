package gitquestion;

public class JumpGame {

    public static void main(String[] args) {
        JumpGame j  = new JumpGame();
        System.out.println(j.canMaxJump(new int[]{2,3,1,1,4}));
        System.out.println(j.canMaxJump(new int[]{3,2,1,0,4}));
    }

    public boolean canMaxJump(int[] nums) {
        int max = 0;
        for(int i =0;i<=max;i++){
            max = Math.max(max,i+nums[i]);
            if(max >=nums.length-1)
                return true;
        }
        return false;
    }
}












/*You are given an integer array nums. You are initially positioned at
the array's first index, and each element in the array represents your maximum jump
length at that position.

Return true if you can reach the last index, or false otherwise.


Example 1:
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what.
 Its maximum jump length is 0, which makes it impossible to reach the last index.*/