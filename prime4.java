package myjavaProj;

import java.util.Scanner;

public class prime4 {

	public static boolean isPrime(int n) {
		if (n <= 2) {
			return n > 1;
		} else if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		if (isPrime(n)) {
			System.out.println(n + " is Prime number");
		} else {
			System.out.println(n + " is not Prime number");
		}
	}
}
