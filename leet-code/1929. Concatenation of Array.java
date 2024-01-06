class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int [] soln = new int[length + length];

        for(int i=0; i<nums.length; i++){
            soln[i] = nums[i] ;
            soln[i+length] = nums[i];   
        } return soln;
    } 
}
