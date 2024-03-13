package com.app.pojo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="number")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class NumbersTable extends BaseEntity
{
	private String ownername;
 private String mobilenumber;

 public NumbersTable(String ownername, String mobilenumber) {
	super();
	this.ownername = ownername;
	this.mobilenumber = mobilenumber;
}
public NumbersTable() {
	super();
}

@Override
public String toString() {
	return "Number [ownername=" + ownername + ", mobilenumber=" + mobilenumber + "]";
}



 
 public String getOwnername() {
	return ownername;
}
public void setOwnername(String ownername) {
	this.ownername = ownername;
}
public String getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(String mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public List<SMS> getSmslist() {
	return smslist;
}
public void setSmslist(List<SMS> smslist) {
	this.smslist = smslist;
}

@OneToMany(mappedBy = "num" , orphanRemoval = true , cascade = CascadeType.ALL ,fetch = FetchType.LAZY  )
 private List<SMS> smslist= new ArrayList<>();
}
