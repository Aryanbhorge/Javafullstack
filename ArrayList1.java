
package javaproject.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
 
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>(); // non parameterize Array constructor 10
		//ArrayList<String> v2=new ArrayList<>(20);
		//ArrayList<String> v3=new ArrayList<>(21,5);
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		System.out.println("Original : v1 : "+fruits);
		//System.out.println("First Element "+fruits.firstElement());
		//System.out.println("Last Element "+fruits.lastElement());
		System.out.println(" index 1 "+fruits.get(1));
		
		fruits.set(0,"Orange");
		
		System.out.println("Contains Mango ? "+fruits.contains("Mango"));
		System.out.println("Size of vector : "+fruits.size());
		
		fruits.remove(1);
		fruits.remove("Orange");
		
		Collections.sort(fruits);
		Collections.reverse(fruits);
		
		
		Iterator<String> itr=fruits.iterator();
		while( itr.hasNext()){
			System.out.println("fruits -> "+itr.next());
		}
		
	/*Enumeration<String> enumeration=(fruits.elements();
	*	while(enumeration.hasMoreElements()) {
	*		System.out.println("fruits -> "+enumeration.nextElement());}
	*/	
		ListIterator<String> listItr=fruits.listIterator();
		while(listItr.hasNext()) {
			System.out.println("fruits -> "+listItr.next());
		}
		
		while(listItr.hasPrevious()) {
			System.out.println("fruits -> "+listItr.previous());
		}
	}
 
}
 