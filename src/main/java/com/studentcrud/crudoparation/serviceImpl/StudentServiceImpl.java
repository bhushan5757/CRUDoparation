package com.studentcrud.crudoparation.serviceImpl;

import java.util.List;
import java.util.Optional;

import com.studentcrud.crudoparation.model.StudentData;

public interface StudentServiceImpl {

	public StudentData saveStu(StudentData stu);

	public Optional<StudentData> findById(Long Id);

	public void deleteById(Long Id);

	public StudentData updateStudent(StudentData student);

	List<StudentData> getStudentByfirstname(String fname);

}
