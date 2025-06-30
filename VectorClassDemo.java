package javaproject.collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
 
public class VectorClassDemo {
 
	

	public static void main(String[] args) {
		Vector<String> v1=new Vector<>(); // non parameterize vector constructor 10
		//Vector<String> v2=new Vector<>(20);
		//Vector<String> v3=new Vector<>(21,5);
		v1.add("Apple");
		v1.add("Banana");
		v1.add("Orange");
		System.out.println("Original : v1 : "+v1);
		System.out.println("First Element "+v1.firstElement());
		System.out.println("Last Element "+v1.lastElement());
		System.out.println(" index 1 "+v1.get(1));
		
		v1.set(0,"Orange");
		
		System.out.println("Contains Mango ? "+v1.contains("Mango"));
		System.out.println("Size of vector : "+v1.size());
		
		v1.remove(1);
		v1.remove("Orange");
		
		Collections.sort(v1);
		Collections.reverse(v1);
		
		
		Iterator<String> itr=v1.iterator();
		while(itr.hasNext()){
			System.out.println("v1 -> "+itr.next());
		}
		
		Enumeration<String> enumeration=v1.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println("v1 -> "+enumeration.nextElement());
		}
		
		ListIterator<String> listItr=v1.listIterator();
		while(listItr.hasNext()) {
			System.out.println("v1 -> "+listItr.next());
		}
		
		while(listItr.hasPrevious()) {
			System.out.println("v1 -> "+listItr.previous());
		}
		Vector<String> cloneV1=(Vector<String>v1.clone());

		
		
		
		
		
		
 
	}
 
}
 