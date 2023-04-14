package Java_Collections;

import java.util.ArrayList;

public class traverseArrayList {
//Write a program to traverse (or iterate) ArrayList?

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(2);
		al.add(7);
		al.add(90);

		for (int i : al) {
			System.out.println(i);
		}

	}

}
