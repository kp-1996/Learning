package com.example.Learning.mapIterate;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class IterateOverHashMap {
	
	public void interateMap() {
		Map<String, Integer> employee = new HashMap<>();
		employee.put("prasada", 20000);
		employee.put("tulasi", 30000);
		employee.forEach((employe,salary)->{
			System.out.println(employe + " => "+salary);
		});
		
		employee.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+ "  -> "+entry.getValue());
		});
		
		employee.keySet().forEach(employe->{
			System.out.println(employe+" --> "+employee.get(employe));
		});
		
	}
	
	

}
