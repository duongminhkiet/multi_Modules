package com.zmk.app1.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zmk.library.lib.service.A1Service;
import com.zmk.library.lib.service.BookService;
import com.zmk.library.lib.service.MyService;

@RestController
public class BookTestController {
	@Autowired
	MyService myService;

	@Autowired
	A1Service a1Service;

	@GetMapping("/")
	public String home() {
		return myService.message() + a1Service.getTestMessage();
	}

	@Autowired
	BookService bookService;

	@GetMapping("/api/app2/insertBook")
	public void insertBook() {
		bookService.createData2Test();
	}

	@GetMapping("/api/app2/insertJPA_Transaction_Test_ok")
	public void insertJPA_Transaction_Test_ok() {
		bookService.insertJPA_Transaction_Test_ok();
	}

	@GetMapping("/api/app2/insertJPA_Transaction_Test_failAll")
	public void insertJPA_Transaction_Test_failAll() {
		try {
			bookService.insertJPA_Transaction_Test_failAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@GetMapping("/api/app2/insertJPA_NOTransaction_Test_failSome")
	public void insertJPA_NOTransaction_Test_failSome() {
		try {
			bookService.insertJPA_NOTransaction_Test_failSome();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
