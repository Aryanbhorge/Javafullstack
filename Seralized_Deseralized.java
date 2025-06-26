package javaproject;
import java.io.FileInputStream; 
import java.io.FileOutputStream; import java.io.IOException; import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Seralized_Deseralized {
		public static void serialize(String fileName, Person person) {
	        try (FileOutputStream objOutFile = new FileOutputStream(fileName); 
	             ObjectOutputStream objOut = new ObjectOutputStream(objOutFile)) {
	            objOut.writeObject(person);
	            System.out.println("Serialization Successful: Object saved to file: " + fileName);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    public static Person deserialize(String fileName) {
	        Person person = null;
	        try (FileInputStream objInFile = new FileInputStream(fileName); 
	             ObjectInputStream objIn = new ObjectInputStream(objInFile)) {
	            person = (Person) objIn.readObject();
	            System.out.println("Deserialization Successful: Object read from file: " + fileName);
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        return person;
	    }
	public static void main(String[] args) {
	String fileName="C:\\Users\\hp\\OneDrive\\Documents\\workspace-spring-tools-for-eclipse-4.31.0.RELEASE\\helloworld\\bin";

    Person p1=new Person("Aryan",18);
    p1.display();
    Seralized_Deseralized.seralizedObject(p1,fileName);
    
	}
	private static void seralizedObject(Person p1, String fileName) {
		
	}
}
class Person implements Seralizable{
private String name;
private int age;
public Person(String name, int age) {
	this.name = name;
	this.age = age;
}
public void display() {
System.out.println("person nmae is"+this.name+"person age"+this.age);
}
}