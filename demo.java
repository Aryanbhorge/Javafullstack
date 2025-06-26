package helloworld;
public class demo {
	public static void operation(double a,double b) {
		System.out.println("sum:"+(a+b));
		System.out.println("sub:"+(a-b));
		System.out.println("mul:"+(a*b));
		System.out.println("div:"+(a/b));
	}
	public static void deatails(String name,String mob,String add) {
     System.out.println("name:"+name+"mob:"+mob+"address:"+add);
	}
	public static void main(String[] args) {
    demo.operation(10,20);
    demo.deatails("Aryan", "8668497406","");
	}

}
