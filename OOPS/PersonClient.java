/*package whatever //do not write package name here */

import java.io.*;

class PersonClient {
	public static void main (String[] args) {
		Person p1 = new Person();  // p1 is a reference 
		Person p2 = new Person(); 
		System.out.println(p1.name);
		System.out.println(p1.age);
		p2.name = "a";
		p2.age = 0;
	}
}
