class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newSize= new int[nums.length+nums.length];
        for(int i=0;i<nums.length;i++){
            newSize[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            newSize[nums.length+i]=nums[i];
        }
        return newSize;
        
    }
    
}