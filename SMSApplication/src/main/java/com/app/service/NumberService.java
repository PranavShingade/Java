package com.app.service;

import java.util.List;

import com.app.pojo.NumbersTable;


public interface NumberService 
{
	NumbersTable addNumber(NumbersTable number);
	  String deleteNumber (long id);
	  NumbersTable UpdateNumber(NumbersTable number,long id);
	  NumbersTable getNumber(long id);
	  List<NumbersTable> getNumberlist();
}
