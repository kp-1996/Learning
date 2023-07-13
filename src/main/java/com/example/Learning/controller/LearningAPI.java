package com.example.Learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Learning.mapIterate.IterateOverHashMap;

@RestController
public class LearningAPI {
	
	@Autowired
	IterateOverHashMap iterateOverHashMap;
	
	@GetMapping(value="/IterateMap")
	public void getIterateMap() {
		iterateOverHashMap.interateMap();
	}

}
