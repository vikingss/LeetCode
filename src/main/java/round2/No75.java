package round2;

public class No75 {
    public void sortColors(int[] nums) {
        int n = nums.length;
        if(n == 0) return;
        int i = 0,start = 0,end= n - 1;
        while(i <= end){
            if(nums[i] == 2) swap(nums,i,end--);
            else if(nums[i] == 1) i++;
            else if(nums[i] == 0) swap(nums,start++,i++);
        }

    }
    private void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
