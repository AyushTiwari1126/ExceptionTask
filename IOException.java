package myjavaProj;

import java.io.FileReader;

public class IOException {
	public static void main(String[] args) {
		try {
//			FileReader fileReader = new FileReader("C:\\Users\\Ayush\\Desktop\\AyushTiwari\\ayush.txt");
			FileReader fileReader = new FileReader("ioexception.txt");

			System.out.println(fileReader.read());


		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}
