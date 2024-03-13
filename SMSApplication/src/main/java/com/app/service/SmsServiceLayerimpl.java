package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojo.SMS;

@Service
@Transactional
public class SmsServiceLayerimpl implements SMSService
{

	@Override
	public SMS addsms(SMS sms) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteSms(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SMS Updatesms(SMS sms, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SMS getsms(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SMS> getsmslist() {
		// TODO Auto-generated method stub
		return null;
	}

}
