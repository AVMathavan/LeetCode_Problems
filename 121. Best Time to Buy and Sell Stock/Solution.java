import java.util.*;
class Solution {
    public static int maxProfit(int[] prices) {
        int cp=prices[0], profit=0, max_profit=0;
        for(int i=0;i<prices.length;i++)
        {
            int sp=prices[i];
            profit=sp-cp;
            if(profit<0)
            {
                cp=sp;
            }
            max_profit=Math.max(profit, max_profit);
        }
        return max_profit;
    }
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("Enter the length of the prices array: ");
		int a=sc.nextInt();
		int[] prices=new int[a];
		System.out.println("Enter the prices:");
		for (int i=0;i<a;i++){
			prices[i]=sc.nextInt();
		}
		int res=maxProfit(prices);
		System.out.println(res);
	}
}