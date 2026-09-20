class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        int n=len/2;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int num=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>n){
                num=entry.getKey();
            }

        }
        return num;

        
    }
}