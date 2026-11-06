class Solution {
    public void moveZeroes(int[] nums) 
    {
        int c=0;
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            c++;
        }
        if(c!=0)
        {
        for(int i=0;i<nums.length;i++)
        {
            if(i!=nums.length-1)
            {
            if(nums[i]==nums[i+1] && nums[i]==0 )
            continue;
            }
            if(nums[i]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
    }
}