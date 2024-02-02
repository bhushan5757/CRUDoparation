package com.studentcrud.crudoparation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentData")
public class StudentData {
@Id
@GeneratedValue(strategy=	GenerationType.IDENTITY)
int StudId;
String fName;
String lName;
String rollNo;
String adress;
Long mobileNo;
public int getStudId() {
	return StudId;
}
public void setStudId(int studId) {
	StudId = studId;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getRollNo() {
	return rollNo;
}
public void setRollNo(String rollNo) {
	this.rollNo = rollNo;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public Long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(Long mobileNo) {
	this.mobileNo = mobileNo;
}
@Override
public String toString() {
	return "StudentData [StudId=" + StudId + ", fName=" + fName + ", lName=" + lName + ", rollNo=" + rollNo
			+ ", adress=" + adress + ", mobileNo=" + mobileNo + "]";
}


	

}
