package divided;

public class n34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans={0,0};
        int left=0,right=nums.length-1;
        if(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                mid=mid-1;
            }else if(nums[mid]==target){
                right=mid-1;
            }
        }
        if(left>=nums.length||nums[left]!=target){
            ans[0]=-1;
        }else{
            ans[0]=left;
        }

        left=0;
        right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]==target){
                left=mid+1;
            }
        }
        if(right<0||nums[right]!=target){
            ans[1]=-1;
        }else{
            ans[1]=right;
        }
        return ans;



    }

    public static void main(String[] args) {
        int[] test={1,2,3};
        int[] i=searchRange(test,2);
        System.out.println(""+i[0]+i[1]);
    }
}
