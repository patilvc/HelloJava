package collection;

import java.util.Stack;

public class Studystack {

	public static void main(String[] args) {


		
		Stack<String> animal= new Stack<>();//Last in first out 
		
		
		animal.push("Cat");
		animal.push("lion");
		animal.push("Hourse");
		animal.push("Dog");
		
		
		System.out.println("Stack :"+ animal);
		
		System.out.println(animal.peek());
		animal.pop();
		System.out.println("Stack :"+ animal);
		animal.pop();
		System.out.println("Stack :"+ animal);
	}

}
