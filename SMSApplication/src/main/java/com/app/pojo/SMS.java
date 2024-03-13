package com.app.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="sms")
public class SMS extends BaseEntity 
{
  private String message;
  private long otp;
  

  public SMS(String message, long otp) {
	super();
	this.message = message;
	this.otp = otp;
	
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public long getOtp() {
	return otp;
}
public void setOtp(long otp) {
	this.otp = otp;
}

@Override
public String toString() {
	return "SMS [message=" + message + ", otp=" + otp + "]";
}
public SMS() {
	super();
}
  
@ManyToOne
private NumbersTable num;
  
}
