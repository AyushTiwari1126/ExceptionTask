package myjavaProj;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number : ");
		int num = sc.nextInt();

		boolean isPrime = false;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				isPrime = true;
				break;
			}
		}
		if (!isPrime) {
			System.out.println(num + " is Prime");
		} else {
			System.out.println(num + " is not Prime");
		}
	}
}
