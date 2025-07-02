

package javaproject.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
 
public class Arraylist2 {

	public static void main(String[] args) {
		ArrayList<Integer> arra = new ArrayList<>(); // non parameterize Array constructor 10
		arra.add(100);
		arra.add(200);
		arra.add(300);
		System.out.println("Original : v1 : "+arra);
		//System.out.println("First Element "+fruits.());
		//System.out.println("Last Element "+fruits.lastElement());
		System.out.println(" index 1 "+arra.get(1));
		
		arra.set(0,50);
		
		System.out.println("Contains 100 ? "+arra.contains(100));
		System.out.println("Size of ArrayList : "+arra.size());
		
		arra.remove(1);
		arra.remove(100);
		
		Collections.sort(arra);
		Collections.reverse(arra);
		
		
		Iterator<Integer> itr=arra.iterator();
		while( itr.hasNext()){
			System.out.println("fruits -> "+itr.next());
		}
		
	/*Enumeration<String> enumeration=(fruits.elements();
	*	while(enumeration.hasMoreElements()) {
	*		System.out.println("fruits -> "+enumeration.nextElement());}
	*/	
		ListIterator<Integer> listItr=arra.listIterator();
		while(listItr.hasNext()) {
			System.out.println("fruits -> "+listItr.next());
		}
		
		while(listItr.hasPrevious()) {
			System.out.println("fruits -> "+listItr.previous());
		}
}
}