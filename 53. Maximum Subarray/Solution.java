import java.util.*;
class Solution {
    public static int maxSubArray(int[] nums) {
        int n=nums.length, sum=0, maximum=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            sum+=nums[i];
            maximum=Math.max(sum, maximum);
            sum=(sum<0)?0:sum;
        }
        return maximum;
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
		int res=maxSubArray(nums);
		System.out.println(res);
	}
}