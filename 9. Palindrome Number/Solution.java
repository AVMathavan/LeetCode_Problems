import java.util.*;
class Solution {
    public static boolean isPalindrome(int x) {
        int y=x;
        int b=0;
        while(x>0)
        {
            b=b*10+x%10;
            x=x/10;
        }
        return y==b;
    }
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("Enter the number:");
		int x=sc.nextInt();
		boolean res=isPalindrome(x);
		System.out.println(res);
	}
}