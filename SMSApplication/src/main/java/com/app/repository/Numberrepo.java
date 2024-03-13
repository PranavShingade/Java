package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.NumbersTable;

public interface Numberrepo extends JpaRepository<NumbersTable,Long>
{

}
