package myjavaProj;

public class ThrowsException {
	public static int divide(int a, int b) throws ArithmeticException {
		int result = a / b;
		return result;
	}

	public static double area(double r) throws Exception {
		if (r < 0) {
			throw new Exception();
		}
		double answer = (Math.PI) * r * r;
		return answer;
	}

	public static void main(String[] args) {
		try {
			int c = divide(10, 0);
			System.out.println(c);

			double d = area(-5.4);
			System.out.println(d);

		} catch (ArithmeticException e) {
			System.out.println("Take positive numbers only : " + e.toString());

		} catch (Exception e) {
			System.out.println("Put Positive radius value : " + e.toString());

		}

	}
}
