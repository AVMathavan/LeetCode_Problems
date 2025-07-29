import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int []sum;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target)
                    return new int[]{i,j};
            }
        }
        return nums;
    }
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("Enter the length of the array: ");
		int a=sc.nextInt();
		int[] nums=new int[a];
		System.out.println("Enter the array:");
		for (int i=0;i<a;i++){
			nums[i]=sc.nextInt();
		}
		System.out.print("Enter the target: ");
		int target=sc.nextInt();
		int[] res=twoSum(nums, target);
		if (res!=null){
			System.out.print(Arrays.toString(res));
		}
		else
			System.out.println("Null");
		
	}
}