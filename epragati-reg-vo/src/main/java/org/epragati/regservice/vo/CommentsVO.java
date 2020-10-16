package org.epragati.regservice.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CommentsVO {

 private String comments;
 private String role;
 private String userId;
 private LocalDate date; 
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
	
	
}
