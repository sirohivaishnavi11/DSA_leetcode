class Solution {
    public int thirdMax(int[] nums) {
        long  largest = Long.MIN_VALUE;
        long slargest = Long.MIN_VALUE ;
        long  tlargest = Long.MIN_VALUE ; 
        for(int i = 0 ; i < nums.length ; i++ ){

          if(nums[i]>largest){
            tlargest = slargest ; 
            slargest = largest ; 
            largest = nums[i];  
          }
          else if(nums[i]>slargest && nums[i]!=largest){
            tlargest = slargest ; 
            slargest = nums[i] ; 
          }
          else if( nums[i]<slargest && nums[i]>tlargest && nums[i]!=slargest && nums[i]!=largest){
            tlargest = nums[i];
          }
        }
       if(tlargest == Long.MIN_VALUE){
    return (int)largest;
}

return (int)tlargest;
    }
     
}
     
             