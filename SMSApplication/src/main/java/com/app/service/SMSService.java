package com.app.service;

import java.util.List;

import com.app.pojo.SMS;

public interface SMSService 
{
  SMS addsms(SMS sms);
  String deleteSms (Long id);
  SMS Updatesms(SMS sms,long id);
  SMS getsms(long id);
  List<SMS> getsmslist();
}
