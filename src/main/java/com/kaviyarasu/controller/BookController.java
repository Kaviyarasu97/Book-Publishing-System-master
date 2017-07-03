package com.kaviyarasu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kaviyarasu.model.Book;
import com.kaviyarasu.service.BookService;

import java.util.List;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("book")
public class BookController {
	@Autowired
	private BookService bookservice;

	@GetMapping("/list")
	public String listBook(ModelMap modelmap) {
		List<Book> book = bookservice.findAll();
		modelmap.addAttribute("books", book);
		System.out.println(book);
		return "book";
	
	}
	
	@GetMapping("/Logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:../Authentication";
	}

	@GetMapping("/{isbn}")
	public String show(@PathVariable("isbn") Long isbn, HttpSession session) {
		System.out.println("ShowBook:" + isbn);
		Book book = bookservice.findOne(isbn);
		session.setAttribute("book", book);
		return "show";
}
}
