import java.util.*;
class Solution {
	static Scanner sc=new Scanner(System.in);
    public static int reverse(int x) {
        int r=0,a;
        while(x!=0){
            a=x%10;
            x=x/10;
            if(r>Integer.MAX_VALUE/10 || (r==Integer.MAX_VALUE/10 && a>7))
                return 0;
            if(r<Integer.MIN_VALUE/10 || (r==Integer.MIN_VALUE/10 && a<-8))
                return 0;
            r=r*10+a;
        }       
        return r;
    }
	public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int x=sc.nextInt();
        int res=reverse(x);
        System.out.println(res);
    }
}