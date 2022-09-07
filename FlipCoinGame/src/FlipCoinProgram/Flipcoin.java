package FlipCoinProgram;

import java.util.*;


public class Flipcoin {

	public static void main(String[] args) {
		
		//Initialization
		int n, h_cnt = 0, t_cnt = 0;
		double heads, tails;
		Scanner sc = new Scanner(System.in);
		
		//Input Data
		System.out.println("Enter no. of times you want to flip the coin: ");
		n = sc.nextInt();
		
		//Computation
		for (int j = 0; j < n; j++)
		{
			double random = Math.random();
			if(random < 0.5)
				t_cnt++;
			else
				h_cnt++;
		}
		
		heads = h_cnt / (double) n * 100;
		tails = t_cnt / (double) n * 100;
		System.out.println("Percentage of heads: "+ heads + "%");
		System.out.println("Percentage of tails: "+ tails + "%");
	}
}
