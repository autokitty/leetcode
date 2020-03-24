package sort;

public class quicksort {
    public  static  void sort(int[] nums,int l,int r){
        if(l>=r) return;
        int first=l,last=r;
        int key=nums[first];
         while (first<last){
                while(first<last&&nums[last]>=key){
                    --last;
                }
                nums[first]=nums[last];

                while (first<last&&nums[first]<=key){
                ++first;
                }
                nums[last]=nums[first];
        }
        nums[first]=key;
        sort(nums,0,first);
        sort(nums,first+1,r);

    }

    public static void main(String[] args) {
        int[] nums={2,1};
        quicksort.sort(nums,0,nums.length-1);
        for (int i:nums){
            System.out.println(i);
        }
    }
}
