
package javaproject.collection;

import java.util.ArrayList;
import java.util.Collections;
 
public class ArrayListClassDemo {
 
	public static void main(String[] args) {
		ArrayList<Integer> arrList=new ArrayList<>();
		for(int i=0;i<=10;i++) {arrList.add(i+2);}
		
		System.out.println("First Element "+arrList.get(0));
		System.out.println("Last Element "+arrList.get(arrList.size()-1));
		System.out.println("is Contains 3 : "+arrList.contains(3));
		arrList.remove(4); //4th index element
		Collections.sort(arrList);
		Collections.sort(arrList,Collections.reverseOrder());//sorted in descending order
		Collections.reverse(arrList);
		arrList.clear();
		
		// 55,77,99,22
 
	}
 
}
 
 