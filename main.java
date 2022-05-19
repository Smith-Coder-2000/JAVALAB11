import java.io.*;
import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<String> arrlist = new ArrayList<String>();

		arrlist.add("Joshua");
		arrlist.add("Rakesh");
		arrlist.add("Mani");
		arrlist.add("Maglin");

		// arrlist.add(3, 35);

		for (String number : arrlist) {
			System.out.println("Number = " + number);
		}
	}
}
