package in.bench.resources.java.collections;

import java.util.LinkedList;

public class Queue_Pop {

	public static void main(String[] args) {

		
		LinkedList<String> ll = new LinkedList<String>();                   // creating LinkedList object of type String

		
		ll.add("Sun");                                                     // adding elements to LinkedList object
		ll.add("Apple");
		ll.add("JBoss");
		ll.add("Whatsup");
		ll.add("Android");
		ll.add("BEA Weblogic");
		ll.add("Apache");

		
		System.out.println("LinkedList as per Insertion Order:\n");                  // Iterating using enhanced for-loop
		for(String str : ll) {
			System.out.println(str);
		}

	
		ll.push("Google");                                                        	// push operation with LL

		
		System.out.println("\n\nIterating after pushing\n");                                 // Iterating using enhanced for-loop
		for(String str : ll) {
			System.out.println(str);
		}

	
		String poppedString = ll.pop();                                                   	// pop operation with LL

		System.out.println("\n\nPopped element : " + poppedString);

	
		System.out.println("\n\nIterating after popping\n");                                      	// Iterating using enhanced for-loop
		for(String str : ll) {
			System.out.println(str);
		}
	}
}