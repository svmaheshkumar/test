package com.example.springmysql.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.springmysql.api.model.Ticket;

public interface TicketDao  extends CrudRepository<Ticket, Integer>{

}
