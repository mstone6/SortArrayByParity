package Leet;

import java.util.ArrayList;

public class HW1 {
	class Solution {
	    public int[] sortArrayByParity(int[] nums) {
	         ArrayList <Integer> sortedNums = new ArrayList<Integer>();
	         int start = 0; 
	         int end = nums.length -1;

	        for(int i = 0; i< nums.length; i++){
	            if(nums[i] % 2 != 0){
	                sortedNums.add(nums[i]);
	            } else{
	                sortedNums.add(0, nums[i]);
	            }
	        }
	        
	        int[] finalNum = new int[nums.length];
	        for(int i = 0; i < nums.length; i ++){
	            finalNum[i] = sortedNums.get(i);
	        }

	       return finalNum;
	    }
	}
	//move all even integers to the top of the array
	//move all odd integers to come after the even ones
	//return an array that satisfies this condition
}