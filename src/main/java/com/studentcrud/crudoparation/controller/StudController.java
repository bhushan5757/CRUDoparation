package com.studentcrud.crudoparation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentcrud.crudoparation.model.StudentData;
import com.studentcrud.crudoparation.service.StudentService;

@RestController
@RequestMapping("/studata")
public class StudController {
	@Autowired
	private StudentService studata;
	
	@PostMapping("/save")
	public ResponseEntity<StudentData> getEmployeeById(@RequestBody StudentData stu) {
		StudentData stu1= studata.saveStu(stu);               
		return ResponseEntity.ok().body(stu1);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<StudentData>> getStudentById(@PathVariable ("id")Long Id){
		Optional<StudentData> stu1=studata.findById(Id);
		return ResponseEntity.ok().body(stu1) ;

	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable ("id")Long Id) {
		studata.deleteById(Id);
	}
	@GetMapping("/getfirstname/{firstname}")
	public ResponseEntity<List<StudentData>> getStudentByCity(@PathVariable ("firstname")String firstname){
		List<StudentData> stu2=	studata.getStudentByfirstname(firstname);
		return ResponseEntity.ok().body(stu2);
	}


	@PutMapping("/update/{id}")
	public ResponseEntity<StudentData> updateStudent(@PathVariable int id,@RequestBody StudentData student) {
	    student.setStudId(id);
	    return ResponseEntity.ok().body(studata.updateStudent(student));
	}

}
