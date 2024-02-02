package com.studentcrud.crudoparation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.studentcrud.crudoparation.model.StudentData;
@Repository
public interface StudentDataDao extends CrudRepository <StudentData,Long> {

	@Query(value = "select * from StudentData where firstname=?1",nativeQuery=true)
	public List<StudentData> getStudentByfname(String firstname);

	

}
