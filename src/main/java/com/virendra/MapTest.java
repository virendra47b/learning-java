package com.virendra;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(100);
		s1.setName("Virendra");
		
		Student s2=new Student();
		s2.setId(50);
		s2.setName("Shubham");
		
		Map<Student,Integer> n=new HashMap<Student, Integer>();
		
		n.put(s1, 50);
		System.out.println(n.get(s2));
		
	}

}
