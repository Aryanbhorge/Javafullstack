
package javaproject.collection;

import java.util.LinkedList;
 
public class LinkedListClassDemo {
 
	public static void main(String[] args) {
    LinkedList<String> linkList=new LinkedList<>();
    linkList.add("Anirudha");
    linkList.push("Dinesh");
    linkList.addFirst("Amish");
    linkList.addLast("Harsh");
    
    linkList.offer("Amisha");
    linkList.offerFirst(null);
    linkList.offerLast(null);
    
    System.out.println("Peek element "+linkList.peek());
    System.out.println("Peek First element "+linkList.peekFirst());
    System.out.println("Peek Last element "+linkList.peekLast());
    
    linkList.set(2,"Amit");
    linkList.remove(4);
    linkList.remove("Anirudha");
    
    linkList.forEach(element-> System.out.println(element+" "));
    
    String arr[]=linkList.toArray(new String[0]);
 
	}
 
}