package myjavaProj;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 20, 8, 56, 27 };
		String s = null;
		try {

//			System.out.println(s.substring(0, 3));
//			System.out.println(s.length());

			System.out.println(arr[6]);

		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}

		catch (NullPointerException e) {
			System.out.println(e.toString());
		}

	}

}
