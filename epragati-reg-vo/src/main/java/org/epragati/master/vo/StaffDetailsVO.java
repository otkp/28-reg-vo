package org.epragati.master.vo;

public class StaffDetailsVO {
private String name;
private QualificationVO qualification;
private String role;
private String aadharNo;
public String getAadharNo() {
	return aadharNo;
}
public void setAadharNo(String aadharNo) {
	this.aadharNo = aadharNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public QualificationVO getQualification() {
	return qualification;
}
public void setQualification(QualificationVO qualification) {
	this.qualification = qualification;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

}
