package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.NumbersTable;
import com.app.service.NumberService;

@RestController
@RequestMapping("/number")
public class NumberController 
{
 @Autowired
 private NumberService numservice;
 
 @PostMapping("/addnumber")
 public ResponseEntity<NumbersTable> addnumbsers(@RequestBody NumbersTable num)
 {
	 return ResponseEntity.ok(numservice.addNumber(num));
 }
 
 @GetMapping("/getnumber/{id}")
 public ResponseEntity<NumbersTable> getnumbers(@PathVariable Long id)
 {
	return ResponseEntity.ok(numservice.getNumber(id));
	 
 }
 @GetMapping("/getnumberlist")
 public ResponseEntity<List<NumbersTable>> getnumbers()
 {
	return ResponseEntity.ok(numservice.getNumberlist());
	 
 }
 
 @PutMapping("/updatenumber/{id}")
 public ResponseEntity<NumbersTable> updatenumbers(@RequestBody NumbersTable num,@PathVariable Long id)
 {
	return ResponseEntity.ok(numservice.UpdateNumber(num, id));
	 
 }
 
 @DeleteMapping("/deletenumber/{id}")
 public ResponseEntity<String> deletenumbers(@PathVariable Long id)
 {
	return ResponseEntity.ok(numservice.deleteNumber(id));
	 
 }
}
