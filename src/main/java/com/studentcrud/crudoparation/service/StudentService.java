package com.studentcrud.crudoparation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentcrud.crudoparation.dao.StudentDataDao;
import com.studentcrud.crudoparation.model.StudentData;
import com.studentcrud.crudoparation.serviceImpl.StudentServiceImpl;
@Service
public class StudentService implements StudentServiceImpl{

	@Autowired
private StudentDataDao studata;

	@Override
	public StudentData saveStu(StudentData stu) {

		return studata.save(stu);
	}
	
	@Override
	public Optional<StudentData> findById(Long Id) {
		Optional<StudentData> stu= studata.findById(Id);
		return stu;
	}
	
	@Override
	public void deleteById(Long id) {
	studata.deleteById(id);
	}
	@Override
	public List<StudentData> getStudentByfirstname(String firstname) {
		List <StudentData> Stu1=studata.getStudentByfname(firstname);
		return Stu1;
	}
	@Override
	public StudentData updateStudent(StudentData student) {
		// TODO Auto-generated method stub
		return studata.save(student);
	}

}
