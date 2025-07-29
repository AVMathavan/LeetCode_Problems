import java.util.*;
class Solution {
    public static int trap(int[] height) {
        int n=height.length;
        int l[]=new int[n];
        l[0]=height[0];
        int r[]=new int[n];
        r[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            l[i]=Math.max(height[i],l[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            r[i]=Math.max(height[i],r[i+1]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.min(l[i],r[i])-height[i];
        }
        return sum;
    }
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("Enter the length of the height array: ");
		int a=sc.nextInt();
		int[] height=new int[a];
		System.out.println("Enter the height:");
		for (int i=0;i<a;i++){
			height[i]=sc.nextInt();
		}
		int res=trap(height);
		System.out.println(res);
	}
}