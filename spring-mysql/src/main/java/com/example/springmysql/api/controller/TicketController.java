package com.example.springmysql.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmysql.api.dao.TicketDao;
import com.example.springmysql.api.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	private TicketDao dao;
	
	@PostMapping("/bookTickets")
	public String bookTickets(@RequestBody List<Ticket> tickets)
	{
		dao.save(tickets);
		
		return "tickets booked :" + tickets.size();
	
	}
	
	@GetMapping("/getTickets")
	public List<Ticket> getTickets()
	{
		
		return (List<Ticket>) dao.findAll();
	}
	
	@GetMapping("/")
	public String home()
	{
		return ("<h1>welcome </h1>");
	}
	@GetMapping("/user")
	public String user()
	{
		return ("<h1>welcome User </h1>");
	}
	@GetMapping("/admin")
	public String admin()
	{
		return ("<h1>welcome admin </h1>");
	}
	
	
	

}
