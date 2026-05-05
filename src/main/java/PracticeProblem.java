/**

        * File: Lesson 5.6 - Parallel arrays

        * Author: Jacky

        * Date Last Modified: May 5, 2026

        */
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int getAge(String[] nameslist, int[] age, String name) {
		for (int i = 0; i < nameslist.length; i++) {
			if (nameslist[i].equalsIgnoreCase(name)) {
				return age[i];
			}
		}
		return 0;
	}

	public static int[] createLengthArray(String[] arr) {
		int arr2[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i].length();
		}
		return arr2;
	}

	public static void swapPeople(String[] names, int[] ages, String name1, String name2) {
		int temp1 = 0;
		int temp2 = 0; 
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name1)) {
				temp1 = i;
				i = names.length;
			}
		}
		for (int i2 = 0; i2 < names.length; i2++) {
			if (names[i2].equalsIgnoreCase(name2)) {
				temp2 = i2;
				i2 = names.length;
			}
		names[temp1] = name2;
		names[temp2] = name1;
		int tempAge = ages[temp1];
		ages[temp1] = ages[temp2];
		ages[temp2] = tempAge;
		}
		
		
		



	}


}
