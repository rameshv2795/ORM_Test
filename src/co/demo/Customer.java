package co.demo;

import java.util.ArrayList;

public class Customer {
	public static void main(String[] args) {
		/*Objects created by developer*/
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(e.size(), "Jason"));
		e.add(new Employee(e.size(), "Sarah"));
		e.add(new Employee(e.size(), "Larry"));
		for(int i = 0; i < e.size(); i++) {
			System.out.println(e.get(i).toString());
		}
		
		/*Spring way*/
	}
}
