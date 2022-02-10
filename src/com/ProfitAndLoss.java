package com;
import java.util.Scanner;
public class ProfitAndLoss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sp");
		int sp = sc.nextInt();
		System.out.println("Enter cp");
		int cp = sc.nextInt();
		if(sp>cp)
		{
			int pro = sp - cp;
			System.out.println("profit is"+pro);
		}
		else
		{
			int loss = cp - sp;
			System.out.println("loss is "+loss);
		}
	
	}

}
