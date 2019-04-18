package com.pci.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pci.model.Student;

@RestController
public class HelloController {

	List<Student> students = Arrays.asList(
			new Student("Bijoyan",22),
			new Student("Prodipto",22)
			);
	
	@RequestMapping("/hello")
	public String display() {
		return "Hello";
	}
	
	@RequestMapping("/students")
	public List<Student> displayStudent() {
		return students;
	}
	
}
