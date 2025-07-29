import java.util.*;
class Solution {
    public static int maxArea(int[] height) {
        int l=0, r=height.length-1;
        int max_area=0;
        while(l<r)
        {
            int area=Math.min(height[l], height[r])*(r-l);
            max_area=Math.max(max_area, area);
            if(height[l]<height[r])
                l++;
            else if(height[l]>height[r])
                r--;
            else
            {
                l++;
                r--;
            }
        }
        return max_area;
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
		int res=maxArea(height);
		System.out.println(res);
	}
}