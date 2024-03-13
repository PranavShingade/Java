package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.exception.CustomException;
import com.app.pojo.NumbersTable;
import com.app.repository.Numberrepo;

@Service
@Transactional
public class NumberServiceImpl implements NumberService
{

	@Autowired
	private Numberrepo numrepo;
	
	@Override
	public NumbersTable addNumber(NumbersTable number) {
		NumbersTable num1=numrepo.save(number);
		return num1;
	}

	@Override
	public String deleteNumber(long id) {
		NumbersTable num1=numrepo.findById(id).orElseThrow(()->  new CustomException("id is not valid please enter a valid id"));
		numrepo.delete(num1);
		return "Number is deleted Succesfully";
	}

	@Override
	public NumbersTable UpdateNumber(NumbersTable number, long id) {
		NumbersTable num1 = numrepo.findById(id).orElseThrow(()->  new CustomException("id is not valid please enter a valid id"));
		num1.setMobilenumber(number.getMobilenumber());
		num1.setOwnername(number.getOwnername());
		return num1;
		
	}

	@Override
	public NumbersTable getNumber(long id) {
		NumbersTable num=numrepo.findById(id).orElseThrow(()-> new CustomException("id is not valid please neter a valid id"));
		return num ;
	}

	@Override
	public List<NumbersTable> getNumberlist() {
		List<NumbersTable> num=numrepo.findAll();
		return num;
	}

}
