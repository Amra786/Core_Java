package Collection;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		int[] a = {10,5,20,11,6};
	System.out.println("Primitive Array before Sorting:");
		for(int a1:a) {
	System.out.println(a1);
		}
		Arrays.sort(a);
	System.out.println("Primitive Array After sorting");
		for(int a1:a) {
	System.out.println(a1);
		}
		String[]s= {"A","Z","B"};
	System.out.println("Object Array before sorting");
		for(String a2:s) {
	System.out.println(a2);
		}
	Arrays.sort(s);
	System.out.println("Object Array after sorting");
		for(String a1:s) {
	System.out.println(a1);
		}
	Arrays.sort(s, new MyComparator8());
	System.out.println("Object Array after sorting by Comparator:");
		for(String a1:s) {
	System.out.println(a1);
	
		}
		}
	}
 class MyComparator8 implements Comparator{
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
 }
 