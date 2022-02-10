package com;
import java.util.Scanner;
public class Expense {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quantity");
		int qua = sc.nextInt();
		System.out.println("Enter the price");
		int pri = sc.nextInt();
	   float Exp = qua * pri;
		
		if(Exp > 5000)
		{
			float dis =(10*Exp)/100;
		float b= Exp - dis;
			System.out.println("expense is " + b);
		}
		else
		{
			System.out.println("Expense is "+Exp);
		}

	}

}
