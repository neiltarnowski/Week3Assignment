package week3;

import java.time.Year;
import java.util.Arrays;

public class week3Homework {

	public static void main(String[] args) {
		//
		//
		int[] ages = {3, 9, 23, 64, 2, 8, 28};
		//
		//
		int lengthOfList = ages.length;
		int divide = Math.abs(ages[lengthOfList - lengthOfList] - ages[lengthOfList - 1]);
		System.out.println(divide);
		//
		//
		int[] ages1 = {3, 9, 23, 64, 2, 8, 28, 45};
		//
		//
		int lengthOfList1 = ages1.length;
		int difference = Math.abs(ages1[lengthOfList1 - lengthOfList1] - ages1[lengthOfList1 - 1]);
		System.out.println(difference);
		//
		//
		int sum = 0;
		for (int i = 0; i < ages1.length; i++) {
			sum += ages1[i];
		}
		double average = sum / lengthOfList1;
		System.out.println(average);
		//
		//
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		average = sum / names.length;
		System.out.println(average);
		//
		//
		String allNames = "";
		for (int i = 0; i < names.length; i++) {
			allNames += names[i] + " ";
		}
		System.out.println(allNames);
		//
		//
		System.out.println("Use array[arr.length] to find the last element in an array");
		//
		//
		System.out.println("Use array[0] to find the first element in an array");
		//
		//
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		//
		//
		sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += nameLengths[i];
		}
		System.out.println(sum);
		//
		//
		System.out.println(duplicateWord("Hello", 5));
		//
		//
		System.out.println(getFullName("Tom", "Sawyer"));
		//
		//
		System.out.println("testIfSumGreaterThan100() returns =>"  + testIfSumGreaterThan100(ages1));
		//
		//
		double[] doubleArr = {45.43, 4.5, 315.4, 423.9};
		double[] emptyDoubleArr = {};
		System.out.println("get AverageOfDoubleArr() returns => " + getAverageOfDouble(doubleArr));
		System.out.println("empty double[] with getAverageOfDouble() returns => " + getAverageOfDouble(emptyDoubleArr));
		//
		//
		double[] anotherDoubleArr = {3.4, 6.3, 2.1, 8.4};
		System.out.println(firstAverageGreater(doubleArr, anotherDoubleArr));
		//
		//
		System.out.println("getAge() returns +> " + getAge(1997));
	}

	private static String duplicateWord(String word, int n) {
		String duplicateWord = "";
		for (int i = 0; i < n; i++) {
			duplicateWord += word;
		}
		return "duplicateWord() returns => " + duplicateWord;	
	}
	
	private static String getFullName(String firstName, String lastName) {
			return "getFullName() returns => " + firstName + " " + lastName;	
	}
	
	private static Boolean testIfSumGreaterThan100(int[] arr) {
			return Arrays.stream(arr).sum() > 100;
	}
	
	private static double getAverageOfDouble(double[] arr) {
			return Arrays.stream(arr).average().orElse(Double.NaN);
	}
	
	private static boolean firstAverageGreater(double[] firstArr, double[] secondArr) {
			return getAverageOfDouble(firstArr) > getAverageOfDouble(secondArr);
	}
	
	private static int getAge(int birthYear) {
			return Year.now().getValue() - birthYear;
	}
}
