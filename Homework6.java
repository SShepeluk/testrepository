//Sharlton Shepeluk

package cop2805;

import java.util.*;

public class Homework6 {

	public static void main(String[] args) {

		List<Integer> factorList = new ArrayList<Integer>();
		List<Integer> smallestList = new ArrayList<Integer>();

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter an integer:");

		int n = keyboard.nextInt();

		factorList = findFactors(n);

		System.out.println("Factors: " + factorList.toString());

		smallestList = smallestFactors(n, factorList);

		System.out.println("Smallest Factors: " + smallestList.toString());

	}// end main

	// Method to find factors of inputted integer =============================
	public static List<Integer> findFactors(int n) {
		List<Integer> tempList = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				tempList.add(i);
			}
		}

		return tempList;

	}

	// Method to find smallest factors of inputted integer
	public static List<Integer> smallestFactors(int n, List factorList) {

		List<Integer> tempSmallestList = new ArrayList<Integer>();

		for (int i = 1; i < factorList.size(); i++) {
			int x = (int) factorList.get(i);

			while (n % x == 0) {
				tempSmallestList.add(x);
				n = n / x;

			}

		}

		return tempSmallestList;

	}
}
