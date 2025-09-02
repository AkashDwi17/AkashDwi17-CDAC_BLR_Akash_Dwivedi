package Inheritance;

import java.util.*;

class Acc {
	long accNum;
	double balance;
	Scanner sc = new Scanner(System.in);

	public double deposite(double amount) {
		System.out.print("Enter your Acc. Number: ");
		long accNo = sc.nextLong();

		if (accNo == accNum) {
			balance += amount;
		}
		return balance;
	}
}

class SavingAcc extends Acc {
	Scanner sc = new Scanner(System.in);
	double intRate;
	
	public SavingAcc (double intRate, long accNum, double balance) {
		this.intRate = intRate;
		this.accNum = accNum;
		this.balance = balance;
	}
	
	public double calInterest () {
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		
		return  (double)(p * r * t) / 100.00;
	}
}

public class BankAcc{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	    while(true) {
	    	SavingAcc [] sv = new SavingAcc[2];
			for (int i = 0; i<sv.length; i++) {
				sv [i] = new SavingAcc(sc.nextDouble(),sc.nextLong(), sc.nextDouble());
			}
			for(int i=0;i<sv.length;i++) {
				System.out.println("enter amount to be deposit: ");
				double amt = sc.nextDouble();
				System.out.println(sv[i].deposite(amt));

				System.out.println(sv[i].calInterest());
			}
	    }
		
		
	}
}

