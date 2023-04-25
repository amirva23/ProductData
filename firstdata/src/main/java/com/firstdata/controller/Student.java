package com.firstdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
@Autowired
     StudentService serv;
@GetMapping("fetch")
	public List<Student>getserve() {
	    List<Student>servList=serv.getserve();
	    return servList;
		// TODO Auto-generated constructor stub
	}
@PostMapping    ("saveStudent")
  public Student saveStudent(@RequestParam Student s)
  {
	return serv.saveStudent(s);
  }
}
