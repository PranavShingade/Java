package com.app.pojo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity 
{    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	

}
